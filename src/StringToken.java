
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class StringToken {

	   public static void main(String[] args) 
       {
	//	   "!,?._'@"
     
         Scanner scan = new Scanner(System.in);
         String s=scan.nextLine(); 
     //  Complete the code
         String k = s.replaceAll(" ", ">");
         System.out.println(k);
           String [] arr =  k.split("[!,?,.,_,',@,>]");    
         //  int [] bnn = k.split("[!,?,.,_,',@,>]");
           //("!|\\?|\\.|\\_|\\'|\\@");      //s.split("!|?|\\.|_|'|@");
           
           for(int  i = 0; i < arr.length; i++){ 	 
                   System.out.println(arr[i]);
               
           }
           
           String[] array = Arrays.asList(k.split("[!,?,.,_,',@,>]")).stream().filter(str-> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
           for(int  i = 0; i < array.length; i++){ 	 
               System.out.println(array[i]);
           
       }
           
//         StringTokenizer defaultTokenizer = new StringTokenizer(s,"[!,?,.,_,',@]" );
//         System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());
//         while (defaultTokenizer.hasMoreTokens())
//         {
//             System.out.println(defaultTokenizer.nextToken());
//         }
       }
}
//hell y, .ty  you?kl