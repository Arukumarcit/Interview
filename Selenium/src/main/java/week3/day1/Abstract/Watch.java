package week3.day1.Abstract;

public interface Watch {
	
	public void call();
	
	public void healthcheck();
	
	boolean music();
	
	default void check() {
		int i=10;
		System.out.println(i);
	}

	 static void staticMethod() {
		 System.out.println(100);
	 }
}
