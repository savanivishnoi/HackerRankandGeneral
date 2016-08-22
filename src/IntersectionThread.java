

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicReference;

public class IntersectionThread implements Runnable{
    public static   ArrayList<ArrayList> arrayStore;
   //public static  AtomicReference<ArrayList<ArrayList>> arrayStore = new AtomicReference<ArrayList<ArrayList>>();
    // ArrayList<Integer>finalResults;
     public static final Object lock = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			arrayStore = new ArrayList<>();
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
			arrays.add(al1);
			arrays.add(al2);
			arrays.add(al3);
		//	arrayStore.add(al2);
			//arrayStore.add(al3);
			ArrayList<Integer> al4 = new ArrayList<Integer>();
			al4.add(6);
			al3.add(7);
			al3.add(9);
			al3.add(12);
			al3.add(23);
			al3.add(30);
			arrays.add(al4);
			//arrayStore.add(al4);
		//	ArrayList<Integer> al4 = new ArrayList<Integer>();
			IntersectionThread it = new IntersectionThread();
			new Thread(it).start();
			
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = -1;
		TimerTask task= new MonitorList();
		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(task, 0, 2000);
		
		//while(count < 16){
			//System.out.println("wait");
				if ( arrayStore.size() >= 2){
					
					for(int  i = 0 ; i < arrayStore.size() -1; i = i+2){
						System.out.println("size " + arrayStore.size());
						SearchThread1 st = new  SearchThread1(i, i+1);
						new Thread(st).start();
						count++;
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//count++;
		//}
//		Timer time = new Timer();
		//for(ArrayList<Integer> al : arrayStore){
				int x =arrayStore.size() - 1;
			ArrayList<Integer> al = arrayStore.get(count);
				for(int i : al){
				System.out.println(i);
			} 
		//}
	}

}

class MonitorList extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (IntersectionThread.lock) {
			
		
//		for(ArrayList<Integer> al : IntersectionThread.arrayStore){
//			for(int i : al){
//				System.out.println("al:  "+IntersectionThread.arrayStore.indexOf(al)+"  i- "+i);
//			}
//		}
		}
	}
	
}

 