package week3.day1.Abstract;

public class AppleWatch extends SmartWatch{

	@Override
	public void healthcheck() {
		// TODO Auto-generated method stub
		
		System.out.println("Interfact -Health check method implemented in Concrete class");
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
		System.out.println("Abstract class-message method implemented in Concrete class");
		
	}
	
	static void staticMethod() {
		 System.out.println(40);
	 }

}
