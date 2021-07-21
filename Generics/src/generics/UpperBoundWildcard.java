package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

	public static void main(String[] args) {
		
		List<Integer>integers = new ArrayList<>();
		integers.add(1);
		integers.add(1);
		printNumber(integers);
		
		List<Double> doubles = new ArrayList<>();
		integers.add(1);
		integers.add(1);
		printNumber(doubles);
//		addToList(numbers, 10);
//		addToList(doubles, 20);
		
		List<Number> numbers= new ArrayList<Number>();
		
		
		
	}
	
	private static void addToList(List<? super Number> numbers, Number i ) {
		numbers.add(i);
	}

	private static void printNumber(List<? extends Number> numbers) {
		numbers.forEach(System.out::println);
		Number number = numbers.get(0);
	}
	
	
	

}
