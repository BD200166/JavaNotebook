
public class SwitchCaseQuery {

	public static void main(String[] args) {
		
      //int number = 2;										//Control structure -> control the program flow
												//Code block is executed based on constants
		//switch(number) {
		//  case 1: System.out.println("Number hat den Wert 1"); break;
		//  case 2: System.out.println("Number hat den Wert 2"); break;
		//  case 3: System.out.println("Number hat den Wert 3"); break;
		//  default: System.out.println("Number hat einen anderen Wert...");
			
		String month = "Februar";
			
		switch(month) {
			case "Januar": System.out.println("Januar"); break;
			case "Februar": System.out.println("Februar"); break;
			case "März": System.out.println("März"); break;
			case "April": System.out.println("April"); break;
			case "Mai": System.out.println("Mai"); break;
			case "Juni": System.out.println("Juni"); break;
			case "Juli": System.out.println("Juli"); break;
			case "August": System.out.println("August"); break;
			case "September": System.out.println("September"); break;
			case "Oktober": System.out.println("Oktober"); break;
			case "November": System.out.println("November"); break;
			case "Dezember": System.out.println("Dezember"); break;
			default: System.out.println("Eingabe ist ungültig.");
		}	
									
	}

}
