

public class EnumTest {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t ;
		//Test.valRead(t.ONE);
		System.out.println(Test.ONE +"hiiii "+Test.ONE.valRead());
	}



}

 enum Test{
	ONE (1),
	TWO (2);
	private final int val;
	Test(int val){
		this.val = val;
	}
	int valRead(){
		return val;
	}
}	
