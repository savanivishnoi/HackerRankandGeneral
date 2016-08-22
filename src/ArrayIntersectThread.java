
import java.util.*;

public class ArrayIntersectThread implements Runnable {
   ArrayList<Integer> arl1;
   ArrayList<Integer> arl2;
   ArrayList<Integer> commonCurr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayIntersectThread ait = new ArrayIntersectThread();
		ait.arl1.add(23);
		ait.arl1.add(27);
		ait.arl1.add(29);
		ait.arl1.add(33);
		ait.arl2.add(23);	
		ait.arl2.add(29);
	   new Thread(ait).start();
	   ArrayIntersectThread ait1 = new ArrayIntersectThread();
//		ait1.arl1.add(23);
//		ait1.arl1.add(27);
//		ait1.arl2.add(23);	
//		 new Thread(ait1).start();
		 
		
	}
	
	public void run(){
		 commonCurr = compare(arl1 , arl2);
		 for( int i : commonCurr){
		 System.out.println(i); 
		 }
	}
	
	 ArrayIntersectThread(){
		arl1 = new ArrayList<>();
		arl2 = new ArrayList<>();
		
	}
	
	public ArrayList<Integer> compare(ArrayList<Integer> al1, 
									ArrayList<Integer> al2 ){
		ArrayList<Integer> commonCurr = new ArrayList<>();
		int len = 0;
		if(al1.size() < al2.size()) 
			len = al1.size();
		else 
			len = al2.size();
		int  i = 0;
		int j = 0;
		System.out.println(len);
		while(i < al1.size() && j < al2.size()){
			if ( al1.get(i) < al2.get(j)){
				i++;
			}
			else if (al1.get(i) > al2.get(j)){
				j++;
			}
			else {
				commonCurr.add(al1.get(i));
				i++;
				j++;
			}
		}
		return commonCurr;
	}
	

}

