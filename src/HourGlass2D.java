
import java.util.*;

public class HourGlass2D {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        int sum = 0;
	        int tempSum=(int) (Math.pow(10,10) * -1);
	       
	        for(int i=0; i < 4; i++){
	            for(int j=0; j < 4; j++){
	            	 sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
	            	 //  00 01 02 03 04... 11 12 13 14..    
	            	 if(sum > tempSum) tempSum = sum;
	        }
	            
	        }
	        System.out.println(tempSum);
	        
	        
	    }

}
