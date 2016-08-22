

public class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;			   
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i + "a");
        System.out.println(i++);
        // prints 7
        System.out.println(i);
        int a =   i++ +  i;
        System.out.println("new.."+i);
        int y1 = 0;
        y1+=i;
        System.out.println(y1+"    i= "+i);
        for(int x = 0; x< 10; ++x){
        		for(int y = 0; y< 10; y++){
        			if ( y == 4){
        				System.out.println("x- break"+x);
        				break;
        			}
        			System.out.println("y-"+x+y);
        		}
        	System.out.println("x-"+x);
        }
        System.out.println("j"+ a+"   "+i);
        System.out.println(fun(a));
        
        String str[] = new String[5];
        str[0] = "Hello";
        str = null;
        System.out.println(str);
        for(int xy = 0; xy < 5 ; xy++){
        		System.out.println(str[xy]);
        	
        }
    }
    static int fun(int i){
    	return ++i;
    }
    xyz ting = new xyz();
    public  class xyz{
    	  void printing(){
    		 System.out.println("hey");
    	 }
    	
    }
}


