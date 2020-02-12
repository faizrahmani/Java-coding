package finalVariable;

// final class, we cannot extend into child class
final class bike1
{
	int speed=40;
	void run()
	{
		System.out.println(speed);
	}
}
 
class honda1 extends bike1  // when we have final class we cannot extend it to a new class

{
	
}


public class finalClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
