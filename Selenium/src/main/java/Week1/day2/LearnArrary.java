package Week1.day2;

import java.util.Arrays;

public class LearnArrary {

	public static void main(StringLearn[] args) {
		// TODO Auto-generated method stub

		int[] marks= {100,50,60,100,40,35,99,100};
		int n=100;
		int count=0;
		
		for(int i=0;i<marks.length;i++) {
			
			if(marks[i]== n) {
				
				count++;
			}
			
		System.out.println(marks[i]);	
		}
		System.out.println(count);
		
	//sort
		Arrays.sort(marks);
	for(int i=0;i<marks.length;i++) {
	
		System.out.println(marks[i]);
	}
	}

}
