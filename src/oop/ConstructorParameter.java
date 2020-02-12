package oop;

public class ConstructorParameter {


		// TODO Auto-generated method stub

		int x;
		int y;
		
		
		ConstructorParameter (int a, int b)
		{
			x=a;
			y=b;
			
		}
		
		void display()
		{
			System.out.println(x+y);
		}
		public static void main(String[] args) {
			ConstructorParameter cm1 = new ConstructorParameter (100, 200);
		cm1.display();
	}

}
