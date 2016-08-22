
import java.util.*;
/*input: {}()
({()})
{}(
[] 
}{
output:
true
true
false
true
false
*/
public class StackBuffer {
	
	   public static void main(String []argh)
	   {
	      Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	            //Complete the code
	          char [] str = new char[input.length()];
	          int top = -1;
	          boolean err = false;
	          for(int i = 0; i < input.length(); i++){
	              if(err ==  true) break;
	                  switch( input.charAt(i)) {
	                      case '}':
	                      if(top >= 0 && str[top] == '{'){
	                           str[top] = '~';
	                           top--;
	                      } else 
	                          err = true;
	                      break;
	                      case ')':
	                      if(top >= 0 && str[top] == '('){
	                           str[top] = '~';
	                           top--;
	                      } else 
	                          err = true;
	                      break;
	                      case ']':
	                      if(top >= 0 && str[top] == '['){
	                           str[top] = '~';
	                           top--;
	                      } else 
	                          err = true;
	                      break;
	                      case '{':
	                      case '[':
	                      case '(':
	                       top++;
	                       str[top] = input.charAt(i);
	               
	                      break;      
	              }           
	          }
	          if(top >= 0 | err ) System.out.println("false");
	          else System.out.println("true");
	      }
	      
	   }

}
