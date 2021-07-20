package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRuntimeCheck {

	public static void main(String[] args) {

		List<String> namesList = new ArrayList<>();
		addTonames(namesList, "Name 1");
		addTonames(namesList, "Name 2");
		System.out.println(namesList);
		incorectAddTonames(namesList, 100);
		System.out.println(namesList);
	//	String name3=namesList.get(2);
		
		
		String[] namesArray =new String [5];
		addToArray(namesArray, "Name 1");
		System.out.println(namesArray);
		incorectAddToArray(namesArray, 10);
		String annotherName=namesArray[0];
		System.out.println(annotherName);
	}

	private static void addToArray(String[] namesArray, String string) {
		namesArray[0]=string;
		
	}
	private static void incorectAddToArray(Object[] namesArray, Integer string) {
		namesArray[0]=string;
		
	}

	private static void addTonames(List<String> names, String string) {
		names.add(string);
	}

	
	
	
	private static void incorectAddTonames(List list, Integer i) {
		list.add(i);	
	}
	
}
