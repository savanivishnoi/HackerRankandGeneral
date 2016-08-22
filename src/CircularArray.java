

import java.util.*;

public class CircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CirArrGen<Integer> cag = new CirArrGen<>();
		cag.add(3);
		cag.add(45);
		cag.add(47);
		cag.add(2);
		cag.add(9);
		cag.add(33);;
		for(int i : cag){
			System.out.println(i);
		}
		cag.rotate(3);
		for(int i: cag){
			System.out.println(i);
		}

	}

}
  class CirArrGen<T>  implements Iterable<T>, Iterator<T>{
	 
	 ArrayList<T> al = new ArrayList<>();
	 
	 public  void add(T t){
		 al.add(t);
	 }
	 
	 public void rotate(int num){
		  for(int i  = al.size() -1 ; i <= 0 ; i--){
			 al.add(i+num, al.get(i));
		  }
			for(Object i: al){
				System.out.println("new"+ i);
			}

		// System.out.println( al.get(7));
		  int x = num - 1;
		  for(int i = al.size() ; i < al.size()+num -1; i--){
			  al.add(x, al.get(i));
			  x--;
		  }
	 }

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		Iterator<T> it = al.iterator();
		return it;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
