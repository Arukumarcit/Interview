package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set <String> name = new HashSet<String>();
		
	System.out.println(name.add("Arun"));
		name.add("Tanishka");
		name.add("Jansi");
		name.add("Selvi");
		System.out.println(name.add("Arun"));
		name.add("");
		List<String> names=new ArrayList<String>(name);
		
		System.out.println(names.get(1));
	}

}
