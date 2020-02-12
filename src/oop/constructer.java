package oop;

public class constructer {


	int sid;
	String sname;
	char grade;
	
	constructer(int id, String name, char g)
	{
	sid=id;
	sname=name;
	grade=g;

	}
	
	void display()
	{
	System.out.println(sid + "  "+ sname+ "   " + grade);
	

	}

}
