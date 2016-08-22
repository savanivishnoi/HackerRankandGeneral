

import java.util.Stack;

public class SetOfStacks extends Stack<Integer> {
	static Stack<Integer>  []  setStacks  = (Stack<Integer>[]) new Stack[3]; 
	//String [] arr = new String[3];
	static SetOfStacks mainStack;
	static int topStack = 0;
	//popAt

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setStacks[0] = new Stack<Integer>();
		setStacks[1] = new Stack<Integer>();
		setStacks[2] = new Stack<Integer>();
		SetOfStacks sos = new SetOfStacks();
		sos.push(10);
		sos.push(01);
		sos.push(21);
		System.out.println("Pop"+sos.pop());
		System.out.println("first");
		sos.printAll();
		sos.push(23);
		sos.push(02);
		sos.push(29);
		System.out.println("sec");
		sos.printAll();
		System.out.println ("size---- "+setStacks[1].size());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PopAt"+sos.popAt(3));
		System.out.println("third");
		sos.printAll();
		sos.push(90);
		sos.push(78);
		sos.push(66);
		System.out.println("four");
		sos.printAll();
		System.out.println("Pop"+ sos.pop());
		System.out.println("five");
		sos.printAll();
		sos.push(89);
		sos.push(49);
		sos.push(569);
		sos.push(18);
		sos.printAll();
		System.out.println("Pop"+ sos.pop());
		sos.printAll();
		sos.push(66);
		
		//  System.out.println("Pop"+ sos.pop());
		System.out.println("PopAt"+  sos.popAt(3));
		System.out.println("six");
		sos.printAll();

	}

	void push(int num){
		if(setStacks[topStack].size() >= 5)
			topStack++;
		setStacks[topStack].push(num);
	}

	public Integer pop(){
		int val = setStacks[topStack].pop();
		if(setStacks[topStack].size() == 0)
			topStack--;	   
		return  val;
	}

	public int popAt(int index){

		int stackNum = index/5 ;
		int pos =  (index % 5) ;
		System.out.print("\n"+pos + "   "+stackNum+ "  "+index);
//		if (pos == 0)
//		{
//			pos = 5;
//		}

		int val = setStacks[stackNum].get(pos);
		adjust(pos, stackNum);
		return val;
	}

	public void adjust(int pos , int stackNum){
		if(pos < 4)
		{	System.out.print("\n  position  "+pos + "   "+stackNum);
			setStacks[stackNum].set(pos, setStacks[stackNum].get(pos +1));	   
		adjust(++pos, stackNum);
		}
		else 
		{	
			stackNum++;
			if(setStacks[stackNum].size() > 0){
				setStacks[stackNum-1].set(--pos,setStacks[stackNum].get(0) );
				pos = 0;
				adjust(pos, stackNum);
			}else {
				setStacks[--stackNum].pop();
			}	
		}
	}
	void printAll(){
		//	  System.out.println("\n");
		for(int i = 0 ; i < 3 ; i++){
			//	 System.out.println("\n");	 
			for(int j = 0 ; j < setStacks[i].size(); j++ ){
				System.out.print("  "+setStacks[i].get(j)+" --"+i);
			}
		}
	}
}
