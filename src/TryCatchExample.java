
import java.util.*;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x  = 0, y =0;
		Scanner scan = new Scanner(System.in);
	        try { 
	                x = scan.nextInt();
	    //        }
//	        catch(InputMismatchException e){
//	            	System.out.println("java.util.InputMismatchException");
//	    }
//	        try{
	        		 y = scan.nextInt();
	        		 if (y == 0){
	        		//	 Throwable th = new Throwable();
	        		//	 th.addSuppressed(new java.lang.ArrayIndexOutOfBoundsException());
	        			// throw th;
	        			 throw new ArithmeticException("/ by zero");
	        		 }}catch (ArithmeticException e){
	        			 System.out.println(e);
	        		 }catch(InputMismatchException e){
	 	            	System.out.println("java.util.InputMismatchException");
	        		 }
	        			 
	        System.out.println(x / y);

	}

}
