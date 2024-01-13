package adderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Callable<Void> {
	
	Value v;
	Lock lock;
	public Adder(Value v, Lock l) {
		this.v = v;
		this.lock =l;
	}
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i <100000; i++) {
			lock.lock();
			this.v.value +=i;
			lock.unlock();
		}
		return null;
	}

}
