package Week1.day1;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=101;
		boolean isprime=true;
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				System.out.println(" No Prime Number"+n);
				isprime=false;
		//	break;
			}
		}
		
		if(isprime) {
			System.out.println(" Prime Number"+n);
		}

System.out.println("Remote Repo ");
		System.out.println("Arun");
		
	int p=15;


	for (int v=2;v<=p;v++){
	boolean isPrime=true;

	for(int i=2;i<v;i++){

	if(v%i==0){

	System.out.println("Not a prime"+v);
	isPrime=false;
	break;
	}
	  
	}
	if(isPrime==true){

	  System.out.println("Prime Number"+v);
	}
	}

	}
}
