

public class ThreadBook {
	 public static void main(String[] args) {
		 new Extender(new Implementer()).start(); // (1)
		new Extender().start(); // (2)
		 new Thread(new Implementer()).start(); // (3)
		 }
		}



class Extender extends Thread {
	 public Extender() { }
	 public Extender(Runnable runnable) {super(runnable);}
	 public void run() {System.out.print("|Extender|");}
	}
	 class Implementer implements Runnable {
	 public void run() {System.out.print("|Implementer|");}
	}
