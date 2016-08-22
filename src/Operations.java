


//write a program to create a linked list and then sort it

class Node{
Node next;
int value;
Node(int value){
// Node n = new Node();
 next = null;
 this.value = value;

 }
}


class LinkedListC{
 Node first;
 LinkedListC(){
      first =  new Node(-1);
     
 }
 //add 
void  nodeAdd(Node n){
     Node temp = first.next;
     first.next = n;
     n.next = temp;
     
 }
 
 void sortList(){
     Node node = first.next;
     Node temp = first.next;
     Node temp1;
     Node prev = first;
    while(temp.next!= null){
      
        while(node.next!=null){
             if(node.value > node.next.value){
             
             temp1 = node.next;
             
                 node.next = node.next.next;
                 
                 
             } 
             
             node = node.next;
            	 
            
        } 
         temp = node.next;
       }
 }
 
 void printList(){
	 Node n = first.next;
 
	 while(n.next!=null){
		 System.out.println(n.value);
		n = n.next; 
	 }
 }
 
}
public class Operations{
public static void main(String args[]){

 LinkedListC l = new LinkedListC();
 Node n = new Node(10);
 l.nodeAdd(n);
 Node n1 = new Node(13);
 l.nodeAdd(n1);
 Node n2 = new Node(14);
 l.nodeAdd(n2);
 l.printList();
 l.sortList();
 l.printList();
 
 
 //add other nodes..
 
}
}
