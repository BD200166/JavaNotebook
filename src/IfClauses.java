
public class IfClauses {

	public static void main(String[] args) {
		
		int age = 12;									//Boolean expression (conditions possible): comparison that gives back a truth value as result [true,false]
		age = age + 1;
												//Comparison Operators
		if(age > 12) {
			System.out.println("Du darfst Cola trinken!");				//[<] less than -> |1 < 2 (true)
		}
		else {										//[>] greater than -> |1 > 2 (false)
			System.out.println("Du darfst keine Cola trinken!");
		}										//[<=] less than or equal to -> |1 <= 1 (true)
												//				|1 <= 2 (true)
	}									
												//[>=] greater than or equal to -> |1 >= 1 (true)
}												//				   |2 >= 1 (true)

												//[==] equal -> |1 == 1 (true)
												//		|1 == 2 (false)
										
												//[!=] unequal -> |1 != 1 (false)
												//		  |1 != 2 (true)
										
