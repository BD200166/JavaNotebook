
public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] names = {"Baris", "Eray", "Pamuk"};		//For-each-loop -> used to work step by step through data structures (for instance arrays)
		/*
		for(int i = 0; i < names.length; i += 1) {			//For-each-loop can only be used if you work with data structures/collection of data
			System.out.println(names[i]);
		}													//With each run, saves a copy of the current value of the data structure in a variable that can be used in the loop body
		*/
		for(String name : names) {							//Attention: Only read access possible
			System.out.println(name);
		}
	}												

}													
