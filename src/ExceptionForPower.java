
import java.util.*;

public class ExceptionForPower {
	
	 public static void main(String []argh)
	    {
	        Scanner in = new Scanner(System.in);

	//        while(in.hasNextInt())
	      //  {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            myCalculator M = new myCalculator();
	            try
	            {
	                System.out.println(M.power(n,p));
	            }
	            catch(Exception e)
	            {
	                System.out.println(e);
	            }
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                //Complete this line
	                System.out.printf("%-15s"+"%03d"+"\n",s1,x);  //formatted output.. print string format
	                System.out.printf("%"+(-16-s1.length())+"s"+"%03d",s1,x);
	            }
	            System.out.println("================================");

	       // }

	    }
}
	 class myCalculator  {
		int    power(int n, int p) throws Exception{
		    	if (n < 0 || p < 0){
		    		throw new Exception("n and p should be non-negative");
		    	}
		    	return (int) Math.pow(n,  p);
		        
		    }
		}




