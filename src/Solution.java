

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean b = true;;
        System.out.println(A.length());
       for(int  i = A.length() -1 , j = 0; i >= A.length()/2 ; i-- ,  j++){
           if(A.charAt(i) == A.charAt(j)){
        	   System.out.println("inside");
               continue;
           }else {
               b = false;
               break;
           } 
       }
        if(b)
             System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
