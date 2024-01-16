package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindOddAndEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evenNos= list.stream().filter(a -> a%2==0).collect(Collectors.toList());
		List<Integer> oddNos = list.stream().filter(a-> a%2!=0).collect(Collectors.toList());
		System.out.println("even nos : "+evenNos);
		System.out.println("odd nos : "+oddNos);
	}

}
