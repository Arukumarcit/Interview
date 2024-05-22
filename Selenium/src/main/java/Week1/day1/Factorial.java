package Week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
	    int sum=1;	
		for(int i=n;i>=1;i--) {
			System.out.println(i);
			sum=sum*i;
		}
		System.out.println(sum);

	}

}
