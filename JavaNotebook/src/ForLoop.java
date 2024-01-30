
public class ForLoop {

	public static void main(String[] args) {
													
		for(int i = 0; i < 10; i += 1) {			//For-loop: also called a counter-loop -> used, when you already know the number of loop iterations
			System.out.println(i);												   
													//Contains a counter variable that contains the number of the current run							   
													
		}											//for(int i = 0; = counter variable;|i < 10; = condition;|i += 1 = increase/decrease of counter variable)
												
	}												//for(int i = 0; i < 10; i += 1) -> step 1 int i = 0; 			  |executed ONCE at the beginning
													//	  System.out.println(i);			  ↓								   ↓	  
													//            						step 2 i < 10; 				  |if condition is met
}													//										  ↓								   ↓	  
													//									step 3 System.out.println(i); |if executed correctly
													//										  ↓								   ↓	  
													//									step 4 i += 1 				  |counter variable is increased/decreased