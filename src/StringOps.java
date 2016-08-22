

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc = "hello";
		String dvd = "heljklo";
		compare(abc, dvd);
		System.out.println(search(abc));
		System.out.println(search("abdjfPLMop"));
		//HeapSort hs ;
		
		String str = "Hello how are u";
		int k = 5;
		//int dis = str.length()/10;
//		for(int i = 0 ; i < dis; i++ ){
//			SearchThread st = new SearchThread();
//			st.run();
//			
//		}
		System.out.println(rotate("Thermometer", 4));
	}
	
	public static String rotate(String str, int k){
		StringBuilder sb = new StringBuilder();
		for(int i = k; i < str.length() ; i++){
			sb.append(str.charAt(i));
			
		} for(int i = 0; i < k; i++){
			sb.append(str.charAt(i));
		}
		return sb.toString();
		
	}
	public static void compare(String a ,String b ){
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length(); i++){
			for(int j = 0 ; j<b.length(); j++){
				if(a.charAt(i) == (b.charAt(j))){
					count++;
					sb.append(a.charAt(i));
					
				}
			}
		}
		
		sb.toString();
		System.out.println("count :  "+count+"  string  "+sb);
	}
	
	public static boolean search(String a){
		Boolean[] b_arr = new Boolean[256];
		for(int i =0; i<256; i++){
			b_arr[i] = false;
		}
		
		for(int i = 0; i< a.length(); i++ ){
			int abc = a.charAt(i);
			System.out.println(abc);
			if (b_arr[abc]){ return false;
			
			}else b_arr[abc]= true;
		}
		return true;
	}
	

}

class SearchThread implements Runnable{
	private int n = 0;
	String chunk = null;
	char search ;
	
	SearchThread(String str, char search){
		chunk = str;
		this.search = search;
		
	}
	

	
	@Override
	public void run(){
	    for(int i = 0 ; i < chunk.length(); i++ ){
	    		if (chunk.charAt(i) == search){
	    			n++;
	    		}
	    }
		
	}
}
