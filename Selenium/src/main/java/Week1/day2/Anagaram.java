package Week1.day2;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Sure";
		String b="eSur";
		
		char[] charArray1 = a.toCharArray();
		char[] charArray2 = b.toCharArray();
		boolean cond=true;
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		for(int i=0;i<charArray1.length;i++) {
			
			if(charArray1[i]!=charArray2[i]) {
				
				System.out.println("Not an Anagram");
				cond=false;
				break;
				
			}
		}
  if(cond==true) {
	  System.out.println("Anagaram");

  }
	}

}
