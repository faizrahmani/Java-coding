package Arrays;

public class Arrays_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//int a=1;
	
	// arrays: array is collection of elements of the same data type
	// There are two types of arrays: 
	// 1st is single dimensional 
	// 2nd one is two/multi dimensional 
	
	/*// single Dimensional Arrays
	 * four rules of an array:
	1. Declare an array
	2. Insert values into arrays
	3. find size of an arrays
	4. Read values from an arrays
		*/
		
		
		//1. Declare an array
		int a[]=new int [5]; // declared array with size 5, starting index is 0, last index is 9
		
		//2. Insert values into arrays
		a[0]=100;
		a[1]=200;
		a[2]=300;				
		a[3]=400;
		a[4]=500;		
		
				
		
		//3. find size of an arrays
		//System.out.println("Length of an array:  " +a.length); // Print length/size of an arrays
		
		
		//4. Read values from an arrays
		//System.out.println(a[2]);
		
		for (int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
