package generics;

import java.util.ArrayList;
import java.util.List;


public class UpperBoundsWildcard {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(1);
		
		List<Double> doubles = new ArrayList<>();
		numbers.add(1);
		numbers.add(1);
		printNumbers(numbers);
		printNumbers(doubles);
		
		List<String> foo= new ArrayList<>();
	//	printNumbers(foo);
		
	}
	
	private static void printNumbers(List<? extends Number> numbers) {
		numbers.forEach(System.out::println);
		Number number = numbers.get(0);
	}

}
