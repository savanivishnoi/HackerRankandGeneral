

public class BinarySrch {

	static int[] input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		input = new int[12];
		int x_e ;
	//	System.out.println(x_e);
		input = new int[]{12, 14, 67, 89, 90, 560, 670, 678, 890, 900, 906, 908};

		System.out.println(search(0,11, 88));
		int a = minsearch(0, 11, 1) ;
		System.out.println("{12, 14, 67, 89, 90, 560, 670, 678, 890, 900, 906, 908}" + "  561");
		System.out.println("a : "+a+"  value: "+input[a]);
	}
	public static Boolean search(int low, int high, int key){
		Boolean x = false;
		System.out.println("low :"+low +"  high: "+high);
		int mid = 0;
		int temp = 0;
		if(low == high ) {
			if ( input[low] == key){
				return true;
			}else return false;
		}
		if(low < high-1){
			mid = (low + high)/2;
			if(input[mid] == key){ 
				x = true; return x;

			}else if(input[mid] > key){
				temp = 1;
				if (low == mid) return false;
				x = search(low, mid, key);

			} else if(input[mid] < key){
				temp = 1;
				if ( mid == high )return false;
				x = search(mid, high, key);
			} }

		return x;
	}

	public static int minsearch(int low, int high, int key){
		int x = -1;
		int mid = 0;
		System.out.println("low :"+low +"  high: "+high);
		if(low < high -1){
			mid = (low + high)/2;
			if(input[mid] == key){ 
				x = mid; return x;}
			else if (mid == 0){
				return mid + 1;
			} else if (mid == input.length-1 ){
				return mid;
			}
			if(input[mid] > key){
				if (mid - low == 1  ) { if(input[low]>key) return low;
				return mid;
				}
				x = minsearch(low, mid, key);
			} else{
				if(high == mid || high - mid == 1){ if (input[high] > key)
					return high;
				}
				x = minsearch(mid, high, key);
			} }
		return x;
	}
}