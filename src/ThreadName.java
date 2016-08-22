

public class ThreadName {
	 public static void main(String[] args) {
		 new Thread(new R2(),"|R2|").start();
		 }
		}



class R1 implements Runnable {
	 public void run() {
	 System.out.print("ME"+Thread.currentThread().getName());
	 }
	}
 class R2 implements Runnable {
	 public void run() {
		 System.out.print(Thread.currentThread().getName()); 
	 new Thread(new R1()).run();
	 new Thread(new R1(),"|R1b|").start();
	 System.out.print(Thread.currentThread().getName());
	 }
	}
	