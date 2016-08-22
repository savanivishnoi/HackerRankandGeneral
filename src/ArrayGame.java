
import java.util.*;

public class ArrayGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for(int i =0 ; i < count ; i++){
			int n = in.nextInt();
			int m = in.nextInt();
			ArrayList al = new ArrayList();
			for(int j = 0; j <n ; j++){
			//	System.out.println("int...");
				al.add(in.nextInt());
			}
			System.out.println(al.size() + "size +"+m);
			GameThread gt = new GameThread(al, m,i);
			gt.start();
		}
	}
}

class GameThread extends Thread{
	ArrayList<Integer> al = new ArrayList();
	int m =0;
	int th = 0;
	GameThread(ArrayList<Integer> al, int m, int th){
		super();
		System.out.println("constr");
		this.al = al;
		this.m = m;
		this.th = th;
	}
	public void winTest(){

//		int lastPosition = al.size();
//		int last2Position = al.size();
		for( int i = 0; i < al.size(); ){
		
//		if(last2Position == i) {
//			System.out.println("NO"+th);
//			return;
//		}
			if(i+m < al.size() && al.get((i+m)) == 0){
//				last2Position = lastPosition;
//				lastPosition =  i;
				al.set(i, 1); 
				i = i+m;	
				
			}else if(i+m >= al.size() | (i+1) >= al.size()  ) 
			{
				System.out.println("Yes + " +th);
				return;			
			}				
			else if(i + 1 < al.size() && al.get((i + 1)) == 0){
//				last2Position = lastPosition;
//				lastPosition = i;
				al.set(i, 1);
				i++;
				continue;
			} else if( i - 1 >= 0 && al.get(i-1) == 0){
//				last2Position = lastPosition;
//				lastPosition = i;
				al.set(i, 1);
				i--;
				continue;
			} else {
				System.out.println("NO  "+th);
				return;
			}
	}
		System.out.println("NO  "+th);
	}

	public void run(){
		winTest();

	}
}
/* Sample input 
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0 */