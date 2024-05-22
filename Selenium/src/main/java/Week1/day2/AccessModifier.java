package Week1.day2;

public class AccessModifier {

	String sValue() {
		return "Arun";
		
	}
	
	int iValue() {
		return 104;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier obj =new AccessModifier();
		System.out.println(obj.iValue());
		System.out.println(obj.sValue());
		
		int iValue = obj.iValue();
		
		
	}

}
