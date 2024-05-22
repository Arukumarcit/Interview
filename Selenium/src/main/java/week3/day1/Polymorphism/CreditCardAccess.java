package week3.day1.Polymorphism;

public class CreditCardAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Creditcard cc= new Creditcard();
		String creditCard = cc.readCreditCard();
		
		System.out.println(creditCard);
		cc.editCreditCard("0987 45666 1234");
		System.out.println(cc.readCreditCard());
	}

}
