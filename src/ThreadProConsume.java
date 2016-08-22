

import java.util.*;

public class ThreadProConsume {
static final Vector<BankAccount> vectoAccount = new Vector<BankAccount>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ib = new BankAccount(1001, 1000);
		
		new Thread(new ThreadConsumer( vectoAccount, ib, 'U')).start();
		new Thread(new ThreadConsumer( vectoAccount, new BankAccount(1002, 1000), 'U')).start();
		new Thread(new ThreadConsumer( vectoAccount, new BankAccount(1002, 1000), 'R')).start();
		new Thread(new ThreadConsumer( vectoAccount, new BankAccount(1005, 1000), 'U')).start();
		new Thread(new ThreadConsumer( vectoAccount, new BankAccount(1005, 1000), 'R')).start();
		new Thread(new ThreadConsumer( vectoAccount, new BankAccount(1004, 1000), 'U')).start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(BankAccount ba: vectoAccount ){
			System.out.println(ba.accountNumber + "  "+ ba.amount);
		}

	}

}
class ThreadConsumer implements Runnable{
	 final Vector<BankAccount> vectorAccount ;
	BankAccount ba;
	char update;
	private boolean empty = false;
	ThreadConsumer(Vector<BankAccount> vectorAccount, BankAccount b, char u){
		ba = b;
		update = u;
		this.vectorAccount = vectorAccount; 
		for(BankAccount b1a: vectorAccount ){
			System.out.println(b1a.accountNumber + "  "+ b1a.amount);
		}
		
	}
	@Override
	public void run() {
	
		// TODO Auto-generated method stub
		if(update == 'U'){
			synchronized(vectorAccount){
		while(empty){
				try {
				//Thread.currentThread().wait();
				vectorAccount.wait();
				//wait(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
		empty = false;
		vectorAccount.add(ba);	
			empty = true ;;
			System.out.println("before notify u");
			vectorAccount.notifyAll();
			}
			
		}
		
		else	if(update == 'R'){
			synchronized(vectorAccount){
		while(!empty){  //false
				try {
		//		Thread.currentThread().wait();		
				vectorAccount.wait();
				System.out.println("waiting... R");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			empty = true;
			
			vectorAccount.remove(ba);
			empty = false;;
			System.out.println("waiting R");
			vectorAccount.notifyAll();
			}
		}
	}
	
}
interface IBankAccount{
	int accountNumber = 0;
	int amount = 0;
	void update(int amount);
	int retrieve();	
}
class BankAccount implements IBankAccount{
	int accountNumber;
	int amount;
	BankAccount(int accN, int amt){
		accountNumber = accN;
		amount = amt;
	}

	@Override
	public void update(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int retrieve() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
