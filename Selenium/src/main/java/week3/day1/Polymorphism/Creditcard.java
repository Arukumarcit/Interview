package week3.day1.Polymorphism;

public class Creditcard {
	
	private String creditCardNo="11234 5678 8999";
	
	public String readCreditCard() {
		
		return creditCardNo;
	}
	
	public void editCreditCard(String credit) {
		
		this.creditCardNo=credit;
	}

}
