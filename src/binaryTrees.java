

public class binaryTrees {
public static void main(String args[]){
	BinTree bt = new BinTree();
	bt.insert(100);
	bt.insert(29);
	bt.insert(2);
	bt.insert(39);
	bt.insert(459);
	bt.insert(90);
	bt.insert(23);
	bt.insert(67);
	bt.insert(33);
	bt.insert(294);
	bt.insert(29);
	bt.insert(229);
	bt.printAll();
	
}
}

class NodeT{
	
int value = 0;
NodeT left;
NodeT right;
NodeT(int value){
    left = null;
    right = null;
    this.value = value;
    
    
}
NodeT(){
    left = null;
    right = null;

}

}

class BinTree{
    private NodeT root;

    BinTree(){
        root = new NodeT(-1);
      
        
    }
    
   void  insert(int value){
        NodeT temp = new NodeT(value);
        System.out.println("Value ------ "+value);
        if(root.value == -1){
        	 System.out.println("Value ------ -1.. "+value);    
        	root.value = value;
        
        }else if(root.value < value ){
          if(root.left == null){ root.left = temp	; return; }   
    		 ins(root.left, temp);
        
        }else if(root.value > value){
        	 if(root.right == null){ root.right = temp	; return; }   
            ins(root.right, temp);
        }
    }
    
    void ins(NodeT troot, NodeT tnode){
     
    	if (tnode.value <= troot.value  ){
    		 if(troot.left == null){ troot.left = tnode; return; }   
        		ins(troot.left, tnode);
        } else if (tnode.value > troot.value ) {
        	 if(troot.right == null){ troot.right = tnode; return;}
        	 ins(troot.right, tnode);
        }
            
        }
    
    
    void printAll(){
    		traverse(root);
    }
    
    void traverse(NodeT troot){
   	 System.out.println("Root ...........--------  "+root.left.value);
         if(troot.left != null){
        	 System.out.println("Left ...........--------  "+troot.left.value);
             traverse(troot.left); 
         } //else System.out.println(troot.left.value);
         System.out.println(troot.value);
         if(troot.right!=null){
        	 System.out.println("Right ...........--------  "+troot.right.value);
             traverse(troot.right);
             
         }//else 
        // System.out.println(troot.value);
    
    }


}


