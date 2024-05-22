package Week1.day2;

import java.util.Arrays;

public class MinMax {

	public static void main(StringLearn[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {-100,-10,0,99,50,-111,33,44,1000};
		
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;) {
			
			System.out.println("Mini value "+a[i]);
			break;
		}
		
		for(int j=a.length-1;j>=0;) {
			
			System.out.println("Maximum value "+a[j]);
			break;
		}

		//Step 2
		
				int min =Integer.MAX_VALUE;
				int max=Integer.MIN_VALUE;
				
				for (int j=0;j<a.length;j++) {
					
					if(min> a[j]) {
						
						min=a[j];
					}else if (max< a[j]) {
						max=a[j];
						
					}
			
				}
				System.out.println("Min vaue" + min);
				System.out.println("max vaue" + max);
				
	}

}
