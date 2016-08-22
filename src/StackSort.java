

import java.util.Stack;

public class StackSort {

	 static Stack<Integer> st1 = new Stack();
//		static Stack<Integer> tempStack = new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       st1.push(10);
       st1.push(8);
       st1.push(12);
       st1.push(19);
       st1.push(5);
       st1.push(39);
       st1.push(2);
       st1.push(17);
       sort(st1, temp);
	}
	
	void sort(Stack<Integer> st , Stack<Integer> tempStack){
//		if ( !st.isEmpty()  && !tempStack.isEmpty() && st.peek() > tempStack.peek()){
//			
//		}
		int temp = -1;
		int newTemp = -1;
		if(!st.isEmpty() ){
			temp = st.pop();
			
		}
		if(!st.isEmpty() && st.peek() >= st.pop()){
			newTemp = st.pop();	
			st.push(temp);
			temp = newTemp;
			newTemp = -1;
		} else if(!tempStack.isEmpty() && temp <= tempStack.peek()){
			tempStack.push(temp);
		}else if(!tempStack.isEmpty() && temp > tempStack.peek()){
			newTemp = tempStack.pop();
			tempStack.push(temp);
			temp = newTemp;
			newTemp = -1;
			
		} else {
			st.push(temp);
		}
		// 2 3 5 4 7 8 4 2
		/*
		 * 
		 2     4 8 7 4 5 3
		 2 3  
		 2  3 5   
		 2 3 5 4  4 8 7
		     
		 
		 */
		
	}
	
	void sort1(Stack<Integer> st , Stack<Integer> tempStack, boolean ascend){
		int newTemp = -1;
		int temp = -1;
	if(ascend){
		if(!st.empty() ){
			temp = st.pop();
			if(!tempStack.isEmpty() && tempStack.peek() < temp){
				newTemp = tempStack.pop();
				tempStack.push(temp);
				temp = newTemp;
				newTemp = -1;		
				sort1(tempStack, st, false);
			} else{
				tempStack.push(temp);
				sort1(tempStack, st, false);
				
			}
		}
	}
	else{  //not ascend
		
	}
	}


	void sort2(Stack<Integer> st , Stack<Integer> tempStack, boolean ascend){
		// n length
		int n = 10;
		for(int i  =0 ; i < n ; i++ ){
			
		}
	}
}
