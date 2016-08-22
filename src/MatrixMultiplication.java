

public class MatrixMultiplication {
	static final int ROWS1 = 3;
	static final int COLS2= 4;
	static final int ROWS2 = 3;
	//static int [][] mat1 = new int[3][4];
	static int [][] mat1= {  {10 , 9, 4, 3},
			{ 2 , 4 , 5 ,1},
			{4 , 7 , 8 ,0 }	};
	static int [][] mat2 =  {  {1 , 3, 2},
			{ 1 , 5 , 7 },
			{5 , 5 , 3  }	,
			{2, 4, 5}};
	//static int [][] mat2 = new int[4][3];
	static int [][] mul = new int[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul.length+"len");
    //  multiply();
		mulThread();
      for(int i = 0; i < ROWS1; i++){
    	  System.out.println();
    	  for(int j = 0; j < ROWS2; j++){
    		  System.out.print("  "+mul[i][j]+"  ");
    	  }
      }
	}
	
	static void multiply(){
		//
		for(int i = 0; i < ROWS1 ; i++){
			for(int  j = 0; j < ROWS2; j++){
				mul[i][j] = 0;
 				for(int k = 0 ; k < COLS2; k++ ){
					mul[i][j] = mul[i][j] + ( mat1[i][k] * mat2[k][j]) ;
				}
			}
		}
	}
	
	static void mulThread(){
		Thread [] th = new Thread[10] ;
		int x = 0;
		for(int i = 0; i < ROWS1 ; i++){
			for(int  j = 0; j < ROWS2; j++){
				
				th[x] = new Thread( new MatrixMulThread(i, j));
				th[x].start();
				x++;
			}
		}
		System.out.println(x);
		for(int k =0; k < x-1; k++){
			try {
				th[k].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

}
