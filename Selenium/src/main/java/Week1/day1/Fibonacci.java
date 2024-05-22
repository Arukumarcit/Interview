package Week1.day1;

public class Fibonacci {
	
public static void main(String[] args) {
	

	int n=5;
	int a=0;
	int b=1;
	int temp=0;
	System.out.print(a);
	System.out.print(b);
	for(int i=0;i<=n;i++) {
    temp=a+b;
	a=b;
	b=temp;
    System.out.print(temp);
		
	}
}
}
