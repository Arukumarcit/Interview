package Week1.day2;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a= {"Tanishka","jansi","Selvi","Arun"};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i].compareToIgnoreCase(a[j])<0) {
					
					String temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	}

}
