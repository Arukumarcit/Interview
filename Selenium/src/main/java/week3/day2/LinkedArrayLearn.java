package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedArrayLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List <String> name = new LinkedList<String>();
		
		name.add("Arun");
		name.add("Tanishka");
		name.add("Jansi");
		name.add("Selvi");
		name.add("Arun");
		name.add("");
		
		for (String values : name) {
		System.out.println(values);
			
		}
		System.out.println("-------------------");
		Collections.sort(name);
		
        for(int i=0;i<name.size();i++) {
        	
        	System.out.println(name.get(i));
        }
	 
		
	}

}

