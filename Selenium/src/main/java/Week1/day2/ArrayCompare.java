package Week1.day2;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,10,9,3};
		int[] b= {9,4,18,30,11};
		String c="Hello";
		
		
		int tempA=0;
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]>tempA) {
				tempA=a[i];
			}
		}
System.out.println(tempA);
		
	int tempB=0;
	for(int i=1;i<b.length;i++) {
		
		if(b[i]>tempB) {
			tempB=b[i];
		}
	}
System.out.println(tempB);

if(tempA>tempB) {
	System.out.println(tempA-tempB);
	
}else {
	System.out.println(tempB-tempA);
}


}

}
