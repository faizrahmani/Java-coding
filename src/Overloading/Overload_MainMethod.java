package Overloading;

public class Overload_MainMethod {

	public void main(int x)
	{
		System.out.println(x);
	}
	
	public void main (int x, int y)
	{
		System.out.println(x+y);
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overload_MainMethod om=new Overload_MainMethod();
		om.main(100);
		om.main(200);
		
	}

}
