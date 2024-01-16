package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixOfAnyNum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22, 33,222,422,255,022,2920);
		List<Integer> numWithPrefix2 = 
				list.stream().map(a-> String.valueOf(a)).filter(a-> a.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("numbers with prefix 2 : "+numWithPrefix2);
	}

}
