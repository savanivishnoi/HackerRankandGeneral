
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL ll = new LL();
		ll.add(100);
		ll.add(20);
		ll.add(300);
		ll.printAll();
		ll.addAtIndex(1, 23);
		ll.printAll();
		ll.reverse();
		ll.printAll();
		
	}

	
}

class LL{
	LLNode first;
//	LL(){
//		if( first == null){
//			first = new LLNode();
//		}
//		
	//}
	void add(int n){
		if(first == null){
			first = new LLNode(n);
		}
		else{ LLNode temp = first;
		while(temp.next != null){
			   temp = temp.next;
			}
		temp.next = (new LLNode(n));

		}
	}
	
	void addAtIndex(int i, int val){
		LLNode temp = first;
		int x = 0;
		while(x < i-1 &&  temp.next != null){
			temp = temp.next;
			x++;
		}
		LLNode temp1 = temp.next;
		temp.next = new LLNode(val);
		temp.next.next = temp1;
		
	}
	void printAll(){
		LLNode temp = first;
		System.out.println("printing");
		while(temp != null){
			 System.out.println(temp.val);
			   temp = temp.next;
			  
			}
		
	}
	
	void reverse(){
		LLNode current = first;
		LLNode before = null;
		LLNode after = first.next.next;
		LLNode temp;
		while(current.next.next!= null){
			if(current == first){
				current.next = null;
				before = current;
			}
			else{
				current.next = before;
			}
				before.next = current;
				System.out.println("current is "+current.val);
				System.out.println("before is... "+before.val);
				System.out.println("after is... "+after.val);
				temp = after;
				after.next = before;
				before = current;
				current = temp;
				after = temp.next;			
				printAll();
			}
		}		
	
}

class LLNode{
	LLNode next;
	int val;
	LLNode(int val){
		next = null;
		this.val = val;
	}
	
}