package streamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 33,222,422,255,022,2920, 422, 222,33);
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max element of given input is : "+max);
		System.out.println("Min element of given input is : "+min);
	}

}
