package streamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 33,222,422,255,022,2920, 422, 222,33);
		Set<Integer> duplicateNos = 
				list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println("duplicate numbers : "+duplicateNos);
	}

}
