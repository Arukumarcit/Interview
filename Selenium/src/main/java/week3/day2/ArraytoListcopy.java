package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ArraytoListcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {10,90,1000,8,1,};
		
		List<Integer> value= new ArrayList<Integer>();
		List<Integer> value1= new ArrayList<Integer>();
		
        for (Integer data : num) {
        	
        	value.add(data);
			
		}
        
        for(int i=0;i< num.length;i++) {
        	
        	value1.add(num[i]);
        }
        
        System.out.println(value1.size());
        
        for (Integer prit : value1) {
        	System.out.println(prit);
			
		}
	}

}
