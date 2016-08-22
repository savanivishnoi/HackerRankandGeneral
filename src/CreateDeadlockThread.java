
public class CreateDeadlockThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			deadlockThread dt1 = new deadlockThread("first");
			deadlockThread dt2 = new deadlockThread("second");
			
			new Thread(dt1).start();
			new Thread(dt2).start();
	}
	
	

}

class deadlockThread implements Runnable{
private  static String a = "w";
private String b ="xx";
private String name;
    deadlockThread(String name){
    		this.name = name;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(name.equals("first")){
		while(true){
		synchronized ( a){
			synchronized (b){
				System.out.println(a + "  "+name);
			}
				System.out.println(a);
		}
		}}else {
			while(true){
				synchronized ( b){
					synchronized (a){
						System.out.println(a + "  "+name);
					}
						System.out.println(a);
				}
		}
		
	}
	}
	
}
