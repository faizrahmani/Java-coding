package overRiding;

class bank

{
	double RateOfInterest()
	{
		return 0;
	}
	
}

class citi extends bank

{
	double RateOfInterest()
	{
		return 10.5;
	}
}

class bofa extends bank
{
	double RateOfInterest()	
	{
return 5.5;
	}
}

class cp1 extends bank
{
	double RateOfInterest()
	{
		return 22.5;
		
	}
}

public class overRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		citi ci=new citi ();
		System.out.println(ci.RateOfInterest());
		
		bofa bo=new bofa ();
		System.out.println(bo.RateOfInterest());
		
		cp1 cp=new cp1();
		System.out.println(cp.RateOfInterest());
		
		
		
	}

}
