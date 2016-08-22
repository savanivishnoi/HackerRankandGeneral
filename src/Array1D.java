
//import java.io.*;
import java.util.*;

public class Array1D {

	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int total = 0;
        int sum = 0;
        int [] arr = new int[count];
       // String str = scan.next();
        for(int i =0; i < count; i++){
        		arr[i] = scan.nextInt();
        }
        for(int i = 0; i < count; i++){
        	// 	if ( arr[i] < 0) total++;
        		for( int j  = i; j < count;j++){
        			sum =   sum + arr[j];   
        			if (sum < 0) total++;
        			
        		}
        		sum = 0;
        }
        System.out.println(total);
        
    }
}
