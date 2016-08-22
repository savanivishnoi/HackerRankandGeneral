

import java.util.*;
import java.math.*;

public class NewYearChaos {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int T = in.nextInt();
	       
	      
	        for(int a0 = 0; a0 < T; a0++){
	            int n = in.nextInt();
	            int q[] = new int[n];
	            for(int q_i=0; q_i < n; q_i++){
	                q[q_i] = in.nextInt();
	            }
	            // your code goes here
	            boolean chaotic = false;
		        int moves = 0;
		        int temp = 0;
		        int prev = 0;
		        int count_swp = 0;
		        
		        for(int i = 0; i < n ;  i++){
		        		if(Math.abs(q[i] - i - 1) > 2 )
		        		{
		        			System.out.println("Too chaotic");
		        		   chaotic = true;
		        		   break;
		        		}        			
		        }
		    	if(chaotic)
        			continue;        
   for(int i = 0; i < n; i++){
       for(int j = i; j < n-1 ; j++){
 //	   	   System.out.println(q[j] +"   "+q[j+1]);
    	      if(q[j] > q[j+1]){
    	    //	      System.out.println("in");
    	    	  		temp = q[j];
                  q[j] = q[j+1];
                  q[j+1] = temp;   
                  moves++;
                  print(q);
    	      } else break;
       }
            }
            if(!chaotic)
            	System.out.println(moves);
            print(q);
	        }
	      
	    }

	 
	 //new method
	 static void print(int [] q){
		  System.out.println("\n");
		 for(int i = 0; i< q.length; i++){
			
			 System.out.print("  "+q[i]+" ");
		 }
	 }
}
