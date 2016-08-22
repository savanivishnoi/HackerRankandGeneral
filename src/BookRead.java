

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BookRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String err = null;
		try {
			ArrayList<String> strings = new ArrayList<>();
			BufferedReader bis  = new BufferedReader(	new FileReader("/Users/savani/Desktop/junglebook.txt"));
			
			while(bis.readLine() != null)
			{
				strings.add(bis.readLine());
				
			}
			bis.close();
		int count = 0;
	
			String [] lines ;//= new String [];   //[strings.size()];
			for(int i  = 0; i < strings.size(); i++){
		//		System.out.println(i +"  -----  "+strings.get(i));
			if(err != null){
				lines = strings.get(i).split(" ");
				count = count + lines.length;
			}}
			System.out.println(count+ "  final");
			System.out.println("error " +err);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			err = e.getMessage();
		  
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			err = e.getMessage();
		} catch(Exception e){
			err = e.getMessage();
			e.printStackTrace();
		}

	}

}
