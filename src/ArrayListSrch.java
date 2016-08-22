

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayListSrch {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner in = new Scanner(System.in);
//	    HashMap<String, Integer> hm = new HashMap<>();
//	    hm.get
       
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        
        int count =in.nextInt();
        int tempCount = 0;
        for(int i=0; i < count; i++){
           tempCount = in.nextInt();
           ArrayList<Integer> arrList1 = new ArrayList();
         //  arrList1.clear();       
           for(int j = 0; j < tempCount; j++ ){
        	   		arrList1.add(in.nextInt());
           }
           arrList.add(arrList1);
        }
  // System.out.println( arrList1.size()+" big" + arrList.size() + "  small") ;
      ArrayList<Integer> temp = new ArrayList();
     
      for(int  i = 0; i< arrList.size(); i++){
  	      temp = arrList.get(i);
    	      System.out.println(temp.size()+"\n");
   	  	for(int j = 0; j < temp.size(); j++){
  	  		System.out.print(" o "+temp.get(j)+" x  ");
   	  	}
//    	  	
     }
        count = in.nextInt();
       
        ArrayList<Integer>  al = new ArrayList();
        for(int i  = 0; i < count; i++){
        	ArrayList<Integer> arrList2 = new ArrayList();
       // 	arrList1.clear();	
        	try{
        		arrList2 = arrList.get((in.nextInt() - 1) ); } 
        		catch (IndexOutOfBoundsException ex){
        			al.add(i, -1);
        		}     		
        		try{
        		
        		al.add(i, arrList2.get((in.nextInt()) - 1)); }
        		catch(IndexOutOfBoundsException ex){
        			al.add(i, -1);
        		}
        }
        for(int i = 0; i < count; i++){
        		if(al.get(i) == -1){
        			System.out.println("Error");
        			
        		}
        		else System.out.println(al.get(i));
        }
    }

}

/*Sample input:
	5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5 
Output:
74
52
37
Error
Error
*/