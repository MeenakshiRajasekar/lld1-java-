package streamPrograms;

import java.util.Arrays;
import java.util.List;

// directly we cannot apply average function to streams
public class AverageOfInput {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Double average = list.stream().mapToInt(a -> a).average().getAsDouble();
		System.out.println("average value is : "+average);
	}

}
