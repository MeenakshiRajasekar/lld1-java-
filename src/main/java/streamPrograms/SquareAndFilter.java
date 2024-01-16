package streamPrograms;

import java.util.Arrays;
import java.util.List;

public class SquareAndFilter {
	
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,2,11);
	Double value = list.stream().map(a-> a*a).filter(a->a>100).mapToInt(a->a).average().getAsDouble();
	System.out.println("after performing three operations : "+ value);
}

}
