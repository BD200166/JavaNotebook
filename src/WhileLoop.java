
public class WhileLoop {

	public static void main(String[] args) {				   //While-loop head-controlled loop: [step 1] loop-head -> loop only executes, if condition is met
										   //				      [step 2] loop-body
												
		//int number = 1;						   //Similar to if-clauses -> repeats as long as condition is met
		//System.out.println(1);
		//System.out.println(2);					   //Boolean expression (conditions possible): comparison that gives back a truth value as result [true,false]
		//System.out.println(3);
		//System.out.println(4);					   //Comparison Operators
		//System.out.println(5);
										   //[<] less than -> |1 < 2 (true)
		int number = 1;
		//head-controlled loop						   //[>] greater than -> |1 > 2 (false)
		while(number <= 5) {
			System.out.println(number);				   //[<=] less than or equal to -> |1 <= 1 (true)
			number += 1;  //<- short for number = number + 1;	   //				   |1 <= 2 (true)
						  
		}				  				   //[>=] greater than or equal to -> |1 >= 1 (true)
										   //				      |2 >= 1 (true)
	}
										   //[==] equal -> |1 == 1 (true)
}										   //		   |1 == 2 (false)
                                        
										   //[!=] unequal -> |1 != 1 (false)
										   //		     |1 != 2 (true)
