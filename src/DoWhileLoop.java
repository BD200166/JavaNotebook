
public class DoWhileLoop {

	public static void main(String[] args) {					   //Do-While-loop body-controlled loop: [step 2] loop-head -> loop always executed once, even if condition is not met at all
																   //								   	 [step 1] loop-body

		//int number = 1;										   //Similar to if-clauses -> repeats as long as condition is met
		//System.out.println(1);
		//System.out.println(2);								   //Boolean expression (conditions possible): comparison that gives back a truth value as result [true,false]
		//System.out.println(3);
		//System.out.println(4);								   //Comparison Operators
		//System.out.println(5);
																   //[<] less than -> |1 < 2 (true)
		int number = 1;
		//body-controlled loop									   //[>] greater than -> |1 > 2 (false)
		do {
			System.out.println(number);							   //[<=] less than or equal to -> |1 <= 1 (true)
			number += 1;  //<- short for number = number + 1;	   //							   |1 <= 2 (true)

		}				  										   //[>=] greater than or equal to -> |1 >= 1 (true)
		while(number <= 5);										   //								  |2 >= 1 (true)
	}
																   //[==] equal -> |1 == 1 (true)
}																   //			   |1 == 2 (false)

																   //[!=] unequal -> |1 != 1 (false)
																   //				 |1 != 2 (true)
