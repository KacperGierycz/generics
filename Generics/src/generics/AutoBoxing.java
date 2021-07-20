package generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AutoBoxing {

	public static void main(String[] args) {
		int i=10;
		Integer x=i;

		List<Integer> list= Arrays.asList(10, 20, 30);
		Iterator<Integer> iterator = list.iterator();
		Integer next = iterator.next();
		
		
	}

}
