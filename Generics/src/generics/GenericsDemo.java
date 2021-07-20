package generics;

import java.util.ArrayList;
import java.util.Date;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Name 1");
		names.add("Name 2");
		
		String myFirstName=  names.get(0);
		System.out.println(myFirstName);
		
	}

}
