package This;

public class thisKeywordDemo {

	// Keyword "THIS" is a reference variable in java that refers to current object
	
	
	
	
	int a,b;// instance variable 
	
	void getValues (int a, int b) // method variable
	
	{
		this.a=a;
		this.b=b;
	}
	
	void printValues()
	
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisKeywordDemo th=new thisKeywordDemo ();
		th.getValues(10,200);
		th.printValues();

		
		
	}

}
