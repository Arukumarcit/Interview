package Week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="TestLeaf";
		
		char[] charArray = a.toCharArray();
		int length = charArray.length-1;
		
		System.out.println(length);
		for(int i=charArray.length-1;i>=0;i--) {
			
			System.out.print(charArray[i]);
		}
		
		
	}

}
