    package Week1.day1;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=5;i>=0;i--) {
			
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		
		}


		        // TODO Auto-generated method stub

		        for (int i = 5; i > 0; i--) {
		            for (int j = 5; j > i; j--) {
		                System.out.print(" "); // Print spaces after asterisks
		            }
		            for (int k = 0; k < i; k++) {
		                System.out.print("*"); // Print asterisks
		            }
		            System.out.println("");
		        }
		    }
	
}