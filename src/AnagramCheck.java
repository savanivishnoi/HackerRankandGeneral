

import java.io.*;
import java.util.*;


public class AnagramCheck {

	
		
		  static boolean isAnagram(String A, String B) {
		      //Complete the function
			
			  int [] temp = new int [255];
		       
		       
		       if(A.length() != B.length()) return false;
		       Arrays.fill(temp, 0);
		       if(A.length() == 0) return true;
		       for(int  i = 0 ; i < A.length(); i++){
		           if ( A.charAt(i) >= 'A' && A.charAt(i) <= 'Z'){
		               temp['a' + ( A.charAt(i) - 'A')]++;
		           }else 
		                temp[A.charAt(i)]++;
		          }
		       for(int i = 0 ; i < B.length(); i++){
		           if ( B.charAt(i) >= 'A' && B.charAt(i) <= 'Z'){
		               temp['a' + ( B.charAt(i) - 'A')]--;
		           }else 
		                temp[B.charAt(i)]--;
		          }
		              
		    
		       for(int i = 0; i < 255; i++){
		           if(temp[i] != 0){
		               return false;
		           }
		       }
		       return true;
		   
		   }
		    public static void main(String[] args) {
		        
		        Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		        String B=sc.next();
		        boolean ret=isAnagram(A,B);
		        if(ret)System.out.println("Anagrams");
		        else System.out.println("Not Anagrams");
		        
		    }

	}

