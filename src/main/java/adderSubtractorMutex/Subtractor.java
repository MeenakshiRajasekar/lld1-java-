package adderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void>{

	Value v;
	Lock lock;
	public Subtractor(Value v, Lock lock) {
		this.v = v;
		this.lock = lock;
	}
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		lock.lock();
		for (int i = 0; i < 100000; i++) {
			this.v.value -=i;
		}
		lock.unlock();
		return null;
	}

}

//adding and subtracting sharing the common resource value,
//changes and editing the value is happening inside the for loop
// by both Adder and Subtactor thread
//this shared resource operation is critical section
//creating lock to allow access to only one thread
//after done with the task, unlock happens