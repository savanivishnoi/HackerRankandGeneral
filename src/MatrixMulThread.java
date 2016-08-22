

public class MatrixMulThread implements Runnable {
	int i = 0;
	int j = 0;
	MatrixMulThread(int row, int col){
		i = row;
		j = col;
	}
	public void run(){
		MatrixMultiplication.mul[i][j] = 0;
		for(int k = 0 ; k < MatrixMultiplication.COLS2; k++ ){
			MatrixMultiplication.mul[i][j] = MatrixMultiplication.mul[i][j] + ( MatrixMultiplication.mat1[i][k] * MatrixMultiplication.mat2[k][j]) ;
			System.out.println(MatrixMultiplication.mat1[i][k]);
		}
	}

}
