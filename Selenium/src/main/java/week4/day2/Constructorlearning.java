package week4.day2;

public class Constructorlearning {

	 String compName="TestLeaf";
	
	Constructorlearning(){
		System.out.println("Default constructor"+compName);
		
	}
	
	Constructorlearning(String compName ){
		this.compName=compName;
		System.out.println("Parameterized constructor  "+compName);
		
	}

	public void Constructorearning(String compName ){
	//	this.compName=compName;
		System.out.println("Parameterized constructor  "+this.compName);
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorlearning cl= new Constructorlearning("TCDF");
		cl.Constructorearning("112");

	}

}
