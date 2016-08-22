

import java.util.ArrayList;

public class   SearchThread1 implements Runnable{
	
	 int index1 , index2 = -1;
//	SearchThread(int ind1, int ind2){
//		
//	}
	


 SearchThread1(int i, int ind2) {
		// TODO Auto-generated constructor stub
	index1 = i;
	index2 = ind2;
	System.out.println("indexes - "+i + "  : "+ind2);
	}



@Override
	public void run(){
	//	ArrayList<Integer> first = IntersectionThread.arrayStore.get(index1);	
	//	ArrayList<Integer> second = IntersectionThread.arrayStore.get(index2);
	ArrayList<Integer> first = IntersectionThreadJoin.resultSet.get(index1);	
		ArrayList<Integer> second = IntersectionThreadJoin.resultSet.get(index2);
		//Class class = 
	//	synchronized (IntersectionThread.lock){
	//	IntersectionThread.arrayStore.remove(first);
	//	IntersectionThread.arrayStore.remove(second); //remove(index2);
	//	}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread id " +Thread.currentThread().getName());
//		for(int x : first){
//	//		System.out.println("common.1.."+x);
//		}
//		for(int x : second){
//		//	System.out.println("common.2.."+x);
//		}
		ArrayList<Integer> commonCurr = new ArrayList<>();
		int len = 0;
		if(first.size() < second.size()) 
			len = first.size();
		else 
			len = second.size();
		int  i = 0;
		int j = 0;
		while(i < first.size() && j < second.size()){
			if ( first.get(i) < second.get(j)){
				i++;
			}
			else if (first.get(i) > second.get(j)){
				j++;
			}
			else {
				commonCurr.add(first.get(i));
				
				i++;
				j++;
			}
		}
		for(int x : commonCurr){
			System.out.println("common..."+x);
		}
		synchronized (IntersectionThreadJoin.lock) {
			
			IntersectionThreadJoin.resultSet.add(commonCurr);
		}
		System.out.println("end thread.. ");
	}
}


