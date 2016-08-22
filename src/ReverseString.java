import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		reverse(str);
		//abced---  decba
		System.out.println(sb);

	}
static	StringBuilder sb = new StringBuilder();
   static String reverse(String s){
	   if(s.length() == 1){
		   sb.append(s.substring(0, 1));
		   return sb.toString();
	   }
	 
	   System.out.println(s.substring(1));
	   reverse(s.substring(1));
	   sb.append(s.substring(0, 1));
	   return sb.toString();
	 
   }
}
