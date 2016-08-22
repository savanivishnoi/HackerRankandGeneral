import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		while(num > 1)
		{
			//System.out.println(num/2);
			System.out.println(num);
			sb.append(Integer.toString(num%2));
			num = num / 2; 
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sb.append(Integer.toString(num));
		
		System.out.println(ReverseString.reverse(sb.toString()));

	}

}
