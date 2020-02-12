package MultiDimArray;

public class MultiDimArrayDemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				int k[][]= {{100,200}, {300,400},{500,600}}; 
		System.out.println("Number of Rows: " + k.length);
		System.out.println("Number of Colums: " + k[0].length);
		
		// enhanced for loop
		
		for (int r[]:k)
		{
			for (int i:r)
			{
				System.out.println(i);
			}
		}
		
	}

}
