
public class ClassCar {		//ClassCar is a complex DataType	//First letter of a class-file should always be written in capital letters -> better overview to find classes faster
	
	//Attributes/properties 									//Classes contain attributes and methods
	private String color;																		   
	private String brand;										//The keywords "public" and "private" are visibility modifier
	private int horsePower;																		  
																//Files | "ClassCar.java" | "PropertiesAndAttributes.java" | "Constructor.java" | "MethodsOverloaded.java" | Legacy.java | ClassDog.java | 
																//| ClassCat.java | | ClassAnimal.java | are related to file |"Classes.java"| and each other
	
	public ClassCar() {	 //Overloaded constructor -> ClassCar(transfer parameter) [no transfer parameter] -> different signature
		System.out.println("Auto wurde erzeugt.");
	}
	
	public ClassCar(String color, String brand, int horsePower) {  ////Overloaded constructor -> ClassCar(transfer parameter) [String color, String brand, int horsePower] -> different signature								   
	  //Keyword "this" specifies color as attribute above and not as parameter for the method
		this.color = color;	 																	    
		this.brand = brand;																		    
		this.horsePower = horsePower;
	  //Keyword "this" attaches the drive() method at the end of the constructor class				
		//this.drive();																				
	}
																			
	//Methods											
	public void drive(int speed) {	//Overloaded method -> drive(transfer parameter) [int speed parameter] -> different signature
		System.out.println("Das Auto fährt " + speed + " km/h");		
	}
	
	public void drive(int speed, String name) {	//Overloaded method -> drive(transfer parameter) [int speed, String name parameter] -> different signature 
		System.out.println("Das Auto fährt...");		
	}
	
	public void drive() {	//Overloaded method -> drive() [no transfer parameter] -> different signature 
		System.out.println("Das Auto fährt...");		
	}

	public String getColor() {		//Setters (setAttributename) and getters (getAttributename)
		return color;
	}								//You can use if-clauses in set-methods and get-methods to set precise access conditions

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
}