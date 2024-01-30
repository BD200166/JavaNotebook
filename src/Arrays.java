
public class Arrays {

	public static void main(String[] args) {
		
		String[] names = new String[3];					//An array is a data structure/collection of data -> initialized by putting "[]" at the end of given DataTypes and keyword "new" after initialization
		
														//Arrays are similar to variables -> but arrays can hold multiple values instead of one = size of array is set during initialization
		names[0] = "Baris";
		names[1] = "Eray";								//The multiple values can be accessed via an index
		names[2] = "Pamuk";
														//Structure: DataType[] plural expression = new DataType[]
		System.out.println(names[0]);
		
		/*
		String[] names = {"Baris", "Eray", "Pamuk"};
		*/
		for(int i = 0; i < names.length; i += 1) {		//Attribute ".length" using max number of initialized size of array
			System.out.println(names[i]);
		}
	}											

}												

												