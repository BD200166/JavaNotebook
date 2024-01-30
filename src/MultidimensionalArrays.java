
public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		String[][] firstAndLastName	= new String[5][2];		//A multidimensional-array is a data structure -> initialized by putting "[][]" at the end of given DataTypes and keyword "new" after initialization
		
		firstAndLastName[0][0] = "Baris";					//Multidimensional-Arrays -> similar to normal (one-dimensional) arrays, only with multiple dimensions
		firstAndLastName[0][1] = "Duran";
															//One-dimensional-Array ->     (0)		 (1)		 (2)		 (3)		 (4)
		firstAndLastName[1][0] = "Max";							
		firstAndLastName[1][1] = "Mustermann";				//Multi-dimensional-Array ->  (0|0)		(0|1)		(0|2)		(0|3)		(0|4)  -> in theory: (0) 1-dimension
															//							  (1|0)		(1|1)		(1|2)		(1|3)		(1|4)			     (0|0) 2-dimensions
		firstAndLastName[2][0] = "Erika";					//							  (2|0)		(2|1)		(2|2)		(2|3)		(2|4)			     (0|0|0) 3-dimensions
		firstAndLastName[2][1] = "Musterfrau";				//																									... and so on
		
		//Outer for-loop: row-index (Zeilenindex)
		//Inner for-loop: column-index (Spaltenindex)
		for(int i = 0; i < firstAndLastName.length; i += 1) {
			for(int j = 0; j < firstAndLastName[i].length; j += 1) {
				System.out.print(firstAndLastName[i][j] + " ");
			}
			System.out.println();
		}
	}

}																
