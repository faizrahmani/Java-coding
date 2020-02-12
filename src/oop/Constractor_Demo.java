package oop;

public class Constractor_Demo {

	
	// Default Constructor
	
	int x;
	int y;
	
	Constractor_Demo()
	
	{
		
		x=10;
		y=20;
	}
	
	void display ()	
	{
		System.out.println(x+y);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constractor_Demo cm1=new Constractor_Demo();
		cm1.display();
		
		
	}

}
