
public class MethodsWithoutReturnValue {

	public static void main(String[] args) {
		
		System.out.println("Vor dem Methodenaufruf");		//Method = piece of pre-programmed code that you can run over and over again without having to rewrite it
		doSomething(40, 40);
		System.out.println("Nach dem Methodenaufruf");		//Parameters -> () are used to edit methods
		
	}
	
	public static void doSomething(int number1, int number2) {		//Keyword "void" = no return value
		int x = number1;
		int y = number2;
		int result = x + y;
		System.out.println("Das Ergebnis lautet " + result);
	}

}
