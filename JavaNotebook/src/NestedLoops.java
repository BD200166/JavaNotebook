
public class NestedLoops {

	public static void main(String[] args) {	//You can nest all types of loops (While-loop|Do-While-loop|For-loop) in nested-loops
		
	  //int test = 0; -> only works for allocated code-block 
		
		for(int i = 1; i < 4; i += 1) {			//<- step 1
			 
			for(int j = 1; j < 4; j += 1) {		//<- step 2
				System.out.print("x ");
			}
			System.out.println();
		}

	}

}
