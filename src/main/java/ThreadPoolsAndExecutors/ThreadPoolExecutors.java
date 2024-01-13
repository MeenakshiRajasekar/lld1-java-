package ThreadPoolsAndExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutors {
	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++) {
			NumberPrinter numberPrinter = new NumberPrinter(i);
			e.execute(numberPrinter);
		}
	}
}
