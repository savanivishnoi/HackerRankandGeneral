import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		reverse(num); ///1123
		System.out.println(sb);
	}
	static StringBuilder sb = new StringBuilder();
  static void reverse(int num){
	  System.out.println(num);
	  if(num/10 == 0){
		  sb.append(Integer.toString(num%10));
		  return;
	  }
	  sb.append(Integer.toString(num%10));
	  reverse(num/10);
	
	  
	  
  }
}
