
import java.util.*;

/*
 * 
 10 5
1 2 2 3 1 4 2 2 2 1 4 
 */
public class DeQArray {
	
	 public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Deque deque = new ArrayDeque<>();
         int n = in.nextInt();
         int m = in.nextInt();
         int temp = 0;
         int maxN = 0;

         for (int i = 0; i < n; i++) {
        	 if(temp == m){
        		 temp--;
        		 if(maxN < deque.size()) {
        			 maxN = deque.size();
        			 }
        		
        		deque.removeFirst(); 
        	 }
             int num = in.nextInt();
             temp++;
             if(! deque.contains(num))
            	 	deque.add(num);
             
             
         }
         System.out.println(maxN);
     }

}
