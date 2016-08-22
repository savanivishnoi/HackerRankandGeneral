

public class ThreadUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i< 5; i++){
			ThreadTest tt = new ThreadTest();
			tt.start();
		
			System.out.println("prining... "+i);
			
		}	
		ThreadTest tt1 = new ThreadTest();
		tt1.start();
	//	tt1.start();
	}
}
