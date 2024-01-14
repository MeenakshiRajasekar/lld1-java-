package hashMapvsHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);

		// set can be iterated in 3 ways
		// set iteration using iterator method
		System.out.println("using iterator method");
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// using for loop
		System.out.println("set iteration using for loop");
		for (Integer values : set) {
			System.out.println(values);
		}
	}

}
