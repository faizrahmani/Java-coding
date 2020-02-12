package Overloading;

public class Constructor_Overloading {

	Constructor_Overloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	Constructor_Overloading(int a, double b)
	{
		System.out.println(a+b);
	}
	
	Constructor_Overloading(double a, int b)
	{
		System.out.println(a+b);
	}
	
	Constructor_Overloading(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		Constructor_Overloading CO=new Constructor_Overloading(100,400,300);

	}

}
