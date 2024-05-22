package Week1.day2;

public class CountofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="TesTeaf";
		char[] charArray = a.toCharArray();

char search='T';
		for(int i=0;i<charArray.length;i++) {
			
			if(charArray[i]==search) {
				
				System.out.println(i);
			}
		
	}

}
}
