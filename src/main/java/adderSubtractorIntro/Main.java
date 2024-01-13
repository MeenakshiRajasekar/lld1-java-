package adderSubtractorIntro;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Value v = new Value();
		Adder adder = new Adder(v);
		Subtractor subtractor = new Subtractor(v);
		
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Void> adderFuture = ex.submit(adder);
		Future< Void> subtractorFuture = ex.submit(subtractor);
		
		Void adderResult = adderFuture.get();
		Void subtractorResult = subtractorFuture.get();
		
		System.out.println(v.value);
	}

}
