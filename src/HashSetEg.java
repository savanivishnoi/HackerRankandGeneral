

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEg {
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int total = in.nextInt();
	        in.nextLine();
	        HashSet hs = new HashSet();
	        for(int i =0; i < total; i++){
	        String str = in.nextLine();   
	        		hs.add(str);
	        		 System.out.println(str +"  "+hs.size());
	        }
	       // System.out.println(hs.size());
	    }

}
