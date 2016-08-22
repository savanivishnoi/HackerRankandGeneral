import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FileInputStream fis;
			try {
				fis = new FileInputStream("name");
				BufferedReader br = new BufferedReader(fis);
				
//				BufferedInputStream bis = new BufferedInputStream(fis);
//				while(bis.available() > 0){
//					
//				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
