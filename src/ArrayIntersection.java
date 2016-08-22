

import java.util.*;

import javassist.bytecode.Descriptor.Iterator;

public class ArrayIntersection {
	static int n = 5;
  //int [] arr1;
//  int [] arr2;
//  int [] arr3;
  static int noOfArrays = 3;
static ArrayList<Integer> common = new ArrayList<>();
//ArrayList<Integer> indexes = new ArrayList<>();
//ArrayList<Integer> prev = new ArrayList<>();
static HashMap<Integer, ArrStruct> hm = new HashMap<>();
//private static int[] arraySort;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrStruct as1 = new ArrStruct();
       // as1.arraySort= new int[5] ;
        as1.arraySort = new int[] {12, 14, 17, 19 , 22};
        ArrStruct as2 = new ArrStruct();
        as2.arraySort = new int[] {11, 12, 13, 17, 18};
        ArrStruct as3 = new ArrStruct();
        as3.arraySort = new int[] {12, 13, 17, 22, 25};
        hm.put(0, as1);
        hm.put(1, as2);
        hm.put(2, as3);
        intersect();
        for(int i : common){
        	System.out.println(i);
        }      
	}
  
public static void  intersect(){
	boolean currNotPresent = false;
	boolean completeSearch = false;
  for(int i = 0;  i < n ;  i++){
	if(completeSearch){
		break;
	}
	  common.add(hm.get(0).arraySort[i]);
	  currNotPresent = false;
	for( int k = 1; k < noOfArrays; k++){  
		if(currNotPresent) 
		{	 common.remove((Integer)hm.get(0).arraySort[i]);
			break; //move to next element
			}
	  for(int j = hm.get(k).indexCurr; j < n; j++ ){
		  if(hm.get(k).indexCurr == n) {
			 completeSearch = true;
			 common.remove((Integer)hm.get(0).arraySort[i]);
			  break;
		  }
		  if( hm.get(0).arraySort[i] > hm.get(k).arraySort[j] ){
			  hm.get(k).prev = hm.get(k).arraySort[j] ;
			  hm.get(k).indexCurr = j;
			  continue;
		  }else if(hm.get(0).arraySort[i] < hm.get(k).arraySort[j] && hm.get(0).arraySort[i] > hm.get(k).prev ){
			  // entry doesn't exist 
			  common.remove((Integer)hm.get(0).arraySort[i]);
			  currNotPresent = true;
			  break;
		  } else if (hm.get(0).arraySort[i] == hm.get(k).arraySort[j]){
			  hm.get(k).prev = hm.get(k).arraySort[j] ;
			  hm.get(k).indexCurr = j;
			  // entry exist add it to array
			//  common.add(hm.get(k).arraySort[j]); ///????????
			  break; // continue with the next for loop
		  }
	  } // for int j
	} //for k
  } // for int i
}

}
class ArrStruct{
	int [] arraySort = new int[5];
	int prev = -1;
	int indexCurr = 0;
}
