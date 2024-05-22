package Week1.day2;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,0,8,9,15,11,100,55};
		int[] b= {1,7,111};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]>b[j]) {
					
				int	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("Maximum==> "+a[0]);
		System.out.println("Mnimum===> "+a[a.length-1]);
		
		
	}

}
