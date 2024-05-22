package Week1.day2;

public class StringLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//literally
	String empName= "Arunkumar";
	
	String greetings="Happ Birthday Tanishka";
	
//Object
	String eName= new String("arunkumar");
	
	if(empName==eName) {
		System.out.println("Matches");
	}
	boolean equalsIgnoreCase = empName.equalsIgnoreCase(eName);
	System.out.println("Set to true or fale"+equalsIgnoreCase );
	
	char[] charArray = empName.toCharArray();
	
	System.out.println(charArray);
	
	String[] a=greetings.split(" ");
	

	
	for(int i=0;i<a.length;i++) {
		
		System.out.println(a[i]);
	}
	


		
		
	}

}
