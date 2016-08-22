
//find sum left = sum right
public class MiddleIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 4, 6, 3, 1 , 5};
		int sumRight = 0;
		int sumLeft = 0;
		int right = arr.length - 1;
		int middle = arr.length /2;
		while(true){
			for(int i = 0 ,  j =  arr.length-1;  i < middle && j >= middle; i++ , j--){
				sumLeft+= arr[i];
				sumRight+= arr[j];
			}
			if(sumRight == sumLeft){
				System.out.println(middle+ "  "+sumRight+"  "+sumLeft);
				break;
			}
			else if(sumRight > sumLeft){
				middle++;
			}
			else 
				middle--;
			if(middle < 0 || middle >= arr.length){
				System.out.println("Incorrect array");
				break;
			}
			sumRight = 0;
			sumLeft = 0;
		}
		

	}

	
}
