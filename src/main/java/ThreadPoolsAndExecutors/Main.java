package ThreadPoolsAndExecutors;

public class Main {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=100;i++) {
			NumberPrinter numPrinter = new NumberPrinter(i);
			Thread t = new Thread(numPrinter);
						t.start();
		}
	}

}
