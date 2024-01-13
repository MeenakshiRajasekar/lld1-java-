package ThreadPoolsAndExecutors;

public class NumberPrinter implements Runnable {
	int numberToPrint;
	
	public NumberPrinter(int numberToPrint) {
		this.numberToPrint = numberToPrint;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread in numberPrinter : " + Thread.currentThread().getName());
	}
	
	

}
