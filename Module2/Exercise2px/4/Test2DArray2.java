/* Exercise 2.4: Compile and execute the above program. Then, modify the above code to create
and print Pascal's triangle. Sample output: 

    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
*/

public class Test2DArray2 {

	public static void main (String[] argv) 
	{
		int size = 5;
		int[][] triangle;
	
		// There are 'size' rows. 
		triangle = new int[size][];
	
		// Each row has a different number of elements.
		for (int i=0; i<size; i++) {
			triangle[i] = new int[i+1];
			triangle[i][i] = 1;
			triangle[i][0] = 1;
			for (int j = 1; j<triangle[i].length-1; j++) {
				triangle[i][j] = triangle[i-1][j]+triangle[i-1][j-1];
			}
		}
		
	
		// Now print.
		System.out.println ("Pascals Triangle: ");
		for (int i = 0; i < size; i++) {
			int d = size - i;
			while (d>0) {
			System.out.print(" ");
			d--;
			} 
			for (int j=0; j<triangle[i].length; j++) {
				System.out.print(" " + triangle[i][j]);
			}
			System.out.println("");
			
		}
	}
}
