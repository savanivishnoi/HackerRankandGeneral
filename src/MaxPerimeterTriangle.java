
import java.util.*;

public class MaxPerimeterTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int []  arr = new int[total];
        for(int  i = 0 ; i < total; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i = total-1; i >= 0; i++){
        		
        }
        	

	}
	
	public static double area(int s1, int s2, int s3){
		int s4 = (s1 + s2 + s3 )/ 2 ;
        double area = Math.sqrt(s4 * (s4 - s1) * (s4 - s2) * (s4 - s3));
        return area;
	}
	public boolean checkDenegerate(int s1, int s2, int s3){
		boolean x = false;
		if (( s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1)
			return true;
		return x;
	}

}
