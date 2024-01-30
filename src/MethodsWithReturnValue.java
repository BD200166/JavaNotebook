
public class MethodsWithReturnValue {

	public static void main(String[] args) {
		
		System.out.println("Vor dem Methodenaufruf");			//Method = piece of pre-programmed code that you can run over and over again without having to rewrite it
		//System.out.println(doSomething(40, 40)); 
		int resultFromMethodDoSomething = doSomething(40, 40);		//Parameters -> () are used to edit methods
		System.out.println(resultFromMethodDoSomething);
		System.out.println("Nach dem Methodenaufruf");		
		
	}
	
	public static int doSomething(int number1, int number2) {		//Keyword "void" = no return value -> in this case switch keyword "void" with given DataType (String, float, byte etc.) 
	  //int result = number1 + number2;					  and System.out.println with "return" to get a value back
	  //return result;												
		return number1 + number2;					//Return value -> value that a method returns to its caller (can be viewed as the result of the method)
		
	}

}
