

import java.util.ArrayList;

import sensor.data.PrePostDemo.xyz;

public class HashMapSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapInt hmi = new HashMapInt();
		CustomObj co = new CustomObj(2, 89);
		hmi.insert(co);
		co.key = 5;
		co.value = 99;
		hmi.insert(co);
		System.out.println("First");
		hmi.searchAll();
		CustomObj co1 = new CustomObj(2, 89);
		co1.key = 55;
		co1.value = 1000;
		hmi.insert(co1);
		System.out.println("Second..");
		hmi.searchAll();
		CustomObj co2 = new CustomObj(2, 89);
		co2.key = 9;
		co2.value = 33;
		
		hmi.insert(co2);
		System.out.println("Third");
		hmi.searchAll();
		CustomObj co3 = new CustomObj(2, 89);
		co3.key = 10;
		co3.value = 3443;
		hmi.insert(co3);
		System.out.println("Fourth..");
		hmi.searchAll();
		CustomObj co4 = new CustomObj(2, 89);
		co4.key = 1;
		co4.value = 33399;
		hmi.insert(co4);
		System.out.println("Fivth");
		hmi.searchAll();
	//	hmi.searchAll();
		System.out.println("Key = 10 value = " +hmi.search(10));
		System.out.println("Key =  55 value = "+hmi.search(55));
		System.out.println("Key =  7 value = "+hmi.search(7));
        PrePostDemo ppd = new PrePostDemo();
		PrePostDemo.xyz ting = ppd.new xyz();
		ting.printing();
		System.out.println("new ");
	//	xyz ting1 = new xyz();
		ting.printing();
	}



}

class HashMapInt{
	private ArrayList<ArrayList<CustomObj>> listMain;
	HashMapInt(){
	listMain = new ArrayList<ArrayList<CustomObj>>();
		//listMAinn = new al<>Integer>
		for(int i = 0; i < 10 ; i++){
			listMain.add(new ArrayList<CustomObj>());
		}
	}
	void insert(CustomObj co){
		int hash = hashFunc(co.key);
		//

		try{ 
			ArrayList<CustomObj> al = listMain.get(hash);
		//	System.out.println("al.... "+al.get(0));
			al.add(co);
			//listMain.get(hash).add(co);
		}catch(java.lang.IndexOutOfBoundsException e){
			ArrayList<CustomObj> temp = new ArrayList<CustomObj>();
			System.out.println("in catch");
			temp.add(co);
			listMain.add(hash, temp);  //new ArrayList<CustomObj>()).add(co));
		}
	}

	int search(int key){
		int hash = hashFunc(key);
		int value = 0;
		// = new ArrayList<>();
		try{ 
			ArrayList<CustomObj> temp = listMain.get(hash);
			//listMain.get(hash).
			for(int i = 0; i< temp.size(); i++){
				System.out.println("in for" + temp.get(i));
				
				if(temp.get(i).key == key){
					System.out.println("in if after for");
					value = temp.get(i).value;
					break;
				}
			}

		}catch(java.lang.IndexOutOfBoundsException e){
			throw new ExceptionInInitializerError("Does not exist");
		}
		return value;
	}

	void searchAll(){
		for(int  i = 0; i < listMain.size(); i++){
		//	System.out.println();
			ArrayList<CustomObj> temp = listMain.get(i);
			for(int j = 0; j< temp.size(); j++){
				System.out.println("values --- "+temp.get(j).key);
			}
		}

	}
	int hashFunc(int n){
		int hash = 0;
		hash = n%10;
		return hash;
	}
}

class CustomObj{
	int key = 0;
	int value = 0;
	CustomObj(int key, int value){
		this.key = key;
		this.value = value;
	}
}
