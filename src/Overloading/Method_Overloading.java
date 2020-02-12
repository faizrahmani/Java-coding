package Overloading;

public class Method_Overloading {

	
	// Method overloading is a feature that allows a class to have more than one method under the same name
	
	
	
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	void add (int a, double b)
	{
		System.out.println(a+b);
	}
	
	
	void add (double a, double b)
	{
		System.out.println(a+b);
	}
	
	
	void add (int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overloading mo=new Method_Overloading();
		mo.add(100, 200);
		mo.add(100, 300.3);
		mo.add(100.8, 300.3);
		mo.add(10, 5);
		mo.add(100, 2000, 4000);
	
		
		
	}

}
