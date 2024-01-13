package adderSubtractorIntro;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

	Value v;
	public Subtractor (Value v) {
		this.v = v;
	}
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=1;i<10000;i++) this.v.value -=i;
		return null;
	}
	

}
