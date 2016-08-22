

import java.io.BufferedReader;
import java.util.Scanner;
// sorted binary..
public class BinMinHeap {
static  int[] 	heapArray ;
	public static void main(String args[]){
		int i  = 0;
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		heapArray = new int[length];
		for(; i<length ; i++){
			heapArray[i] = 0;
		}
		for(i = 0; i < heapArray.length+5; i++){
			insert(scan.nextInt());
			
		}
	//	insert(a);
		printAll();
		
	}
	
	static void insert(int value){
		int temp;
		System.out.println("value = "+value + "one  "+heapArray[0]);
		
		if(heapArray[0] < value){
			temp = heapArray[0];
			heapArray[0] = value;
			value = temp;
			recur(0);
		
		}
		else{
			System.out.println("Value discarded   "+value);
		}
	}
	static void recur(int pos ){
		int temp = 0;
		int temp_pos = 0;
		if((2*pos +1) < heapArray.length && (2*pos +2) < heapArray.length ){
		 if	( heapArray[(2*pos+1)]  < heapArray[(2*pos+2)] ) temp_pos = 2*pos + 1;
		 else temp_pos = 2*pos+2;
		} else if ((2*pos +1) < heapArray.length){
			temp_pos  = 2*pos+1;
		}else return;
		
		
		if( heapArray[pos] > heapArray[temp_pos]){
			temp = heapArray[pos];
			heapArray[pos] = heapArray[temp_pos];
			heapArray[(temp_pos)]	= temp;
			recur(temp_pos);
		}
			
			
//		}else if ((2*pos +2) < heapArray.length &&heapArray[pos] > heapArray[(2*pos+2)]){
//			temp = heapArray[pos];
//			heapArray[pos] = heapArray[(2*pos+2)];
//			heapArray[(2*pos+2)]	= temp;
//			recur(2*pos+2);
//		}
	}
	
//	int left_child(int pos){
//		int left = 0;
//		if ((left = 2*pos +1 ) && left < heapArray.length)
//			return left;
//		return left;
//	}
	
//	int righ
	static void printAll(){
		for(int i = 0; i< heapArray.length; i++){
			System.out.println("Position   ="+i +"    Value = "+heapArray[i]);
		}
	}

}
