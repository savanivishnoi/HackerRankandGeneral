

import java.util.ArrayList;

public class IntersectionThreadJoin implements Runnable {
	public static   ArrayList<ArrayList> arrayStore;
	public static ArrayList<ArrayList> resultSet = new ArrayList<>();
		public static final Object lock = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<ArrayList> arrays = new ArrayList<>();
		al1.add(7);
		al1.add(12);
		al1.add(15);
		al1.add(19);
		al1.add(23);
		al1.add(27);
		al1.add(33);
		al1.add(35);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		//arrayStore.get();
		al2.add(7);
		al2.add(10);
		al2.add(12);
		al2.add(14);
		al2.add(17);
		al2.add(18);
		al2.add(19);
		al2.add(23);
		al2.add(39);
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(7);
		al3.add(10);
		al3.add(11);
		al3.add(13);
		al3.add(17);
		al3.add(18);
		al3.add(22);
		al3.add(23);
		al3.add(49);
		resultSet.add(al1);
		resultSet.add(al2);
		resultSet.add(al3);
	//	arrayStore.add(al2);
		//arrayStore.add(al3);
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		al4.add(6);
		al4.add(7);
		al4.add(9);
		al4.add(12);
		al4.add(23);
		al4.add(30);
		resultSet.add(al4);
		ArrayList<Integer> al5 = new ArrayList<Integer>();
		al5.add(6);
		al5.add(7);
		al5.add(9);
		al5.add(10);
		al5.add(23);
		al5.add(30);
		al5.add(35);
		resultSet.add(al5);
		//arrayStore.add(al4);
	//	ArrayList<Integer> al4 = new ArrayList<Integer>();
		IntersectionThreadJoin it = new IntersectionThreadJoin();
		new Thread(it).start();	
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	SearchThread1  st  = new SearchThread;
		Thread [] t = new Thread[100];
	// calculate number of levels..  
		int len = resultSet.size();
		int  i = 0;
		int numOfLevels = (int) ( Math.log(len)/Math.log(2));		
	
	//calculating first 	array
		int threadCount = 0;
//		for( i = 0; i < arrayStore.size() -1; i = i+2){
//			SearchThread1 st = new  SearchThread1(i, i+1);
//			t[threadCount] = new Thread(st);
//			t[threadCount].start();
//			//count++;	
//			threadCount++;
//		}
//		for(int j = 0; j < threadCount; j++){
//			try {
//				t[j].join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		int k = 0; // considered threads
		
		for(i = 0; i <= numOfLevels ; i++){
			int curr = resultSet.size();
			for(  ; k < curr - 1;  k = k+2 ){
				SearchThread1 st = new SearchThread1(k, k+1);
				t[threadCount] = new Thread(st, Integer.toString(i)+Integer.toString(k));
				t[threadCount].start();
				threadCount++;
			}
			for(int j = 0; j < threadCount; j++){
				try {
					System.out.println("before join");
					t[j].join();
					System.out.println("after join");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	for(int  z = 0 ; z < resultSet.size() ; z ++)	 {	
		ArrayList<Integer> al = resultSet.get(z);
		for(int q : al){
			System.out.println(z+"... -"+q);
		} 
	}
	System.out.println(threadCount);
		}
	}


