package streamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 33,222,900,255,022,2920, 422, 222,33);
		int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("second highest element is "+secondHighest);
	}

}
