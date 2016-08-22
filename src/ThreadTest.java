

public class ThreadTest extends Thread {
	static long  a  = 0;
	long x = 0;
         public  void  run(){
        	    //a++;
        	    try {
			for(int i = 0; i < 10000; i++){
        	    			//System.out.println("a == "+ ++a+"  thread id ... "+Thread.currentThread());
					x = a * 1000 + a^2 + ++a;
				//	System.out.println("new a:"+a+"new x:"+x);
        	    			Thread.sleep(100);
			}} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	    System.out.println("a == "+ ++a+"  done for thread id ... "+Thread.currentThread() + " x :"+x); 
        	    String x  = "pre";
        	 
        	    		
           }
}




