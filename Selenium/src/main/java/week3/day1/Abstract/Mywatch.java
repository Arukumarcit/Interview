package week3.day1.Abstract;

public class Mywatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppleWatch watch= new AppleWatch();
		System.out.println(watch.music());
		watch.call();
		watch.healthcheck();
		watch.message();
		watch.check();
		watch.staticMethod();

	}

}
