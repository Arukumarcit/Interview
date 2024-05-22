package week3.day1.Abstract;

public abstract class SmartWatch implements Watch {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call method implemented in Abstract class");
		
	}
    public abstract void message();

	@Override
	public boolean music() {
		// TODO Auto-generated method stub
		return false;
	}

}
