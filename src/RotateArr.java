

import java.util.Scanner;
/*
 * example input
 3 2 3
1 2 3
0
1
2
 */
public class RotateArr {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
	        */
	        Scanner scan = new Scanner(System.in);
	        
	        int count = scan.nextInt();
	        int rotate = scan.nextInt();
	        int queries = scan.nextInt();
	        int [] arr= new int[count];
	        for(int  i = 0; i < count ; i++){
	            arr[i] = scan.nextInt();
	        }
	        int [] new_arr = new int[rotate];
	        int n = count-1;
	        System.out.println("len "+new_arr.length);
	        for(int j = rotate-1; j >= 0; j--){
	        		System.out.println(j + new_arr[j]);
	            new_arr[j] = arr[n];
	            n--;
	            if(n < 0){
	                n  = count -1;
	            }
	        }
	        for(int i = count  ; i > rotate ; i--){
	            arr[i-1] = arr[i-rotate-1];
	        }
	        for(int i = 0 ; i < rotate;i++){
	            arr[i]= new_arr[i];
	            
	        }
	        System.out.println("array");
	        for(int  i = 0; i< count; i++){
	        		System.out.println(arr[i]);
	        }
	        System.out.println("array");
	        int y  = 0;
	        for(int x = 0 ;x < queries; x++){
	        	y = scan.nextInt();
	        System.out.println("y "+y); 
	        	System.out.println(arr[y]);
	        }
	        
	    }
}
