package Week1.day2;

import java.util.Arrays;

public class Duplicate {

	public static void main(StringLearn[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,01,99,55,10,99,100};
		
	//	Arrays.sort(a);
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]==a[i+1]) {
				
				System.out.println("Duplicate value"+a[i]);
				count++;
			}
		}
		
	
	}

}
