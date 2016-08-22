

public class Cl_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Savani";
		Cl_Change.change(str);
		System.out.println(str);
		NameClass nc = new NameClass();
		nc.setB(50);
		System.out.println(nc.getA() + "---A  B-- "+nc.getB());
		Cl_Change ch = new Cl_Change();
		ch.setObj(nc);
		System.out.println(nc.getA() + "---A  B-- "+nc.getB());
		

	}

}
