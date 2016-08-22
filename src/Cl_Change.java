

public class Cl_Change {
	public static void change(String str){
		str = "Sandeep";
		
		
	}
	public void setA(int x){
		x  = 20;
	}
	public void setObj(NameClass nc){
		NameClass nn = new NameClass();
		nn.setB(35);
		
		nc = nn;
		nc.setB(78);
		System.out.println(nc.getA() + "++---A  B++-- "+nc.getB());
		System.out.println(nn.getA() + "-+--A  B--+ "+nn.getB());
	}

}
