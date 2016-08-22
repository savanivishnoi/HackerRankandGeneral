

import java.util.LinkedList;

public class QueueCatDog {
	
	LinkedList<CatDog>   queue = new LinkedList<>();
//	LinkedList<Integer> catQ = new LinkedList<>();
//	LinkedList<Integer> dogQ = new LinkedList<>();
	public boolean cat;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void enqueueCat(int cat){
		queue.add(new CatDog(cat, true));
	}
	public void enqueueDog(int dog){
		queue.add(new CatDog(dog, false));
	}
	
	public void dequeueDog(){
		queue.get(0);
	}
	
	class CatDog{
		int animal;
		boolean cat; //true  = cat
		CatDog(int an, boolean c){
			animal = an;
			cat = c;
		}
	}
	
	
	

}
