package streamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescendingOrder {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 33,222,422,255,022,2920, 422, 222,33);
		List<Integer> sortedList = list.stream().sorted().distinct().collect(Collectors.toList());
		List<Integer> descSortedList = 
				list.stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println("asceding order list : "+sortedList);
		System.out.println("descending order list : "+descSortedList);
	}

}
