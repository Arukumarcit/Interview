package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLnkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set <String> name = new LinkedHashSet<String>();
		
	System.out.println(name.add("Arun"));
	System.out.println(name.add("Tanishka"));
		name.add("Jansi");
		name.add("Selvi");
		System.out.println(name.add("Arun"));
		name.add("");
		
		for (String values : name) {
		System.out.println(values);
			
		}
	}

}

