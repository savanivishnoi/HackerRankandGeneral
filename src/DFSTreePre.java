

import java.util.*;
//l l 
public class DFSTreePre {
	
	LinkedList<BinTreeNode> ls = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSTreePre tree = new DFSTreePre();
		BinTreeNode bn1 = tree.new BinTreeNode();
		bn1.data = 90;
		BinTreeNode bn2 = tree.new BinTreeNode();
		bn2.data = 80;
		bn2.left = bn1;
		BinTreeNode bn3 = tree.new BinTreeNode();
		bn3.data = 770;
		bn2.right = bn3 ;
		BinTreeNode bn4 = tree.new BinTreeNode();
		bn4.data = 60;
		bn4.left = bn2;
		BinTreeNode bn5 = tree.new BinTreeNode();
		bn5.data = 69;
		bn4.right = bn5;
		BinTreeNode bn6 = tree.new BinTreeNode();
		bn6.data = 88;
		bn5.right = bn6;
		BinTreeNode bn7 = tree.new BinTreeNode();
		bn7.data = 99;
		bn5.left = bn7;
		BinTreeNode bn8 = tree.new BinTreeNode();
		bn8.data = 9;
		bn6.right = bn8;
		bn8.left = (tree.new BinTreeNode(null, null, 63));
		
		tree.bfsTraverse(bn4);
		
		
		//bn1.left
	}
	
	/*
	 pre order
	 root left right
	 */
	public void preTraverse(BinTreeNode bn){
		
		System.out.println(bn.data );
		if(bn.left != null) 
			preTraverse(bn.left);
		
		if(bn.right != null)
			preTraverse(bn.right);
	}
	
/*
 post order
 left right root
 */
	public void postTraverse(BinTreeNode bn){
		
		if(bn.left != null) 
			postTraverse(bn.left);
		
		if(bn.right != null)
			postTraverse(bn.right);
		System.out.println(bn.data );
	}
/*
 in order traversal... 	 left root right
 */
	public void  inTraverse(BinTreeNode bn){  
		if(bn.left!= null)
			inTraverse(bn.left);
		System.out.println(bn.data);
		if(bn.right!= null)
			inTraverse(bn.right);
	}
	/*
	 breadth first..
	 usually implemnted using queue
	 */
	public void bfsTraverse(BinTreeNode bn){
	//	System.out.println(bn.data);
		Queue<BinTreeNode> qu = new LinkedList<BinTreeNode>();;
		qu.add(bn);
	while(!qu.isEmpty()){
		BinTreeNode temp = qu.remove();	
		if(temp.left != null)
			qu.add(temp.left);
		if(temp.right != null)
			qu.add(temp.right);
		System.out.println(temp.data);
	}
		
	}

	
	class BinTreeNode{
		BinTreeNode left = null;
		BinTreeNode right = null;
		int data;
		BinTreeNode(){
			
		}
		BinTreeNode(BinTreeNode left, BinTreeNode r, int d){
			this.left = left;
			right = r;
			data = d;
		}
	}

}

