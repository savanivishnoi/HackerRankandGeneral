
import java.util.*;

public class ThreeStackArray {
	static int [] arr = new int[9];
	static int [] top = new int[3];
	static int [] start = new int[3];
	static int[] min = {99999, 99999, 99999};
	static Stack<Integer> minst;
		
	// 0 - n/3, n/3 +1 - 2n/3, 2n/3 , n

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		minst = new Stack<Integer>();
		System.out.println("enter int and arr name");
		top[0] = top[1] =top[2] = -1;
		//sc.nextInt();
		push(10, 0);
		push(100, 1);
		push(20, 0);
		push(20, 0);
		push(23, 0);
		System.out.println("Pop"+pop(0));
		System.out.println("Min"+ min(0));
		push(13, 2);
		printAll();
		push(15, 2);
		System.out.println("Min"+ min(2));
		push(9, 2);
		System.out.println("Pop"+pop(0));
		System.out.println("Min"+ min(2));
		push(23,1);
		printAll();
		System.out.println("Pop"+pop(2));
		push(89,2);
		System.out.println("Min"+ min(1));
		printAll();
		System.out.println("Min"+ min(0));System.out.println("Min"+ min(1));System.out.println("Min"+ min(2));
	}
	
	static void push(int val, int arr_num){
		
		if(top[arr_num] < TopArr.top(arr_num) - 1){
			if(top[arr_num] == -1)
				top[arr_num] = TopArr.begin(arr_num);
			else top[arr_num]++;
			arr[top[arr_num]] = val;
			setMin(val, arr_num);
			
		} else System.out.println("Reached max limit");
	}
  static int pop(int arr_num){
	  int value = arr[top[arr_num]];
	  remMin(value, arr_num);
	  if(top[arr_num]> TopArr.begin(arr_num)){
		  top[arr_num]--;
	  } 
	  return value;
  }
  
  static void setMin(int num, int arr_num){
	  if(num < minst.peek() ){
		  minst.push(num);
	  }	  
  }
  static void remMin(int num, int arr_num){
	  if(num == min[arr_num]){
		  int temp = 9999;
		  for(int i =TopArr.begin(arr_num); i < top[arr_num]; i++ ){
			  if( arr[i] < temp){
				  temp = arr[i];
			  }
			  
		  }
		  min[arr_num] = temp;
	  }
  }
  static int min(int arr_num){
	  return min[arr_num];
  }
  
static void printAll(){
	System.out.println("\n");
	for(int  i = 0; i < 9; i++){
	    System.out.print("   "+arr[i]+"   ");	
	}
}
}
class TopArr{
	
	static final int n = 9;
	static int begin(int arr_n){
		switch (arr_n){
		case 0: {
			return 0;
		    }
		case 1:{
			return n/3;	
		}
		case 2:{
			return 2*n/3;
		}
		}
		return -1;	
	}
	
	static int top(int arr_n){
		switch (arr_n){
		case 0: {
			return n/3;
		    }
		case 1:{
			return 2*n/3;	
		}
		case 2:{
			return n;
		}
		}
		return -1;	
	}
}
