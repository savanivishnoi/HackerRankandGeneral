

import java.util.LinkedList;

public class InverseLinkedList {
 static LinkedListforRev<Integer> ll = new LinkedListforRev<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ll.add(34);
	 ll.add(387);
	 ll.add(78);
	 ll.add(67);
	 ll.add(89);
	 ll.add(23);
	ll.printAll();
	ll.reverse();
	System.out.println("Reverse:  ");
	ll.printAll();
	 
	}

}

class LinkedListforRev<T>{
	MyNode<T> first =  null;//new MyNode<T>();
	public void add(T val){
		MyNode<T> temp = new MyNode<>(val);
		MyNode<T> curr = first;
		if(first == null){
			first = temp;
			return;
		}
		while(curr.next != null){
			curr = curr.next;		
		}
		curr.next = temp;
	}
	
	public void printAll(){
		MyNode<T> curr = first;
		while(curr != null){
		//	System.out.println("1");
			System.out.println(curr.t.toString());
			curr = curr.next;		
		}
	}
	
	public void reverse(){
	//	MyNode<T> init = first;
		   MyNode<T> curr = first;
			MyNode<T> next  = curr.next;
			MyNode<T> prev = null; ;
			MyNode<T> temp;
		while(curr != null){
			temp = curr.next;
			curr.next = prev;
			 System.out.println("val -" +curr.t); 
			//next.next = curr;
			prev = curr;
			curr = temp;
		//	next = temp;
			
 
//			if(init.next.next == null){
//				first.next = init.next;
//			//	 curr.next = init;
//				 break;
//			}
//			else  { 
//				next.next = curr;
//				prev = next;
//				
//				
//				temp1= init.next.next;
//			next.next = curr;
//			 init = temp1; 
//			 System.out.println("val -" +init.t); }
			 
		} 
		first = prev;
		
		
	}
	
}

class MyNode<T>{
	 T t ;
	MyNode next = null;
	MyNode(){
		
	}
	MyNode(T t, MyNode next){
		this.t = t;
		this.next = next;
	}
	MyNode(T t){
		this.t = t;
	}
}
