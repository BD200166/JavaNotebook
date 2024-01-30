
public class Classes {

	public static void main(String[] args) {
	  //ClassDog(ChildClass/SubClass) inherits from ClassAnimal(ParentClass/SuperClass)
		ClassDog dog = new ClassDog(); 
		dog.sleep();
		dog.setName("Bello");
		System.out.println(dog.getName());
		
	  //ClassCat(ChildClass/SubClass) inherits from ClassAnimal(ParentClass/SuperClass)
		ClassCat cat = new ClassCat(); 
		cat.sleep();
		cat.setName("Luna");
		System.out.println(cat.getName());
		
	  //Instantiation of an object	
	  //ClassCar car1 = new ClassCar("Grün", "VW", 130); 	//Keyword "new" then "name of the class/complex DataType"() -> constructor call
	  //ClassCar car2 = new ClassCar();
		
	   //car1.drive(30);
	   //System.out.println(car1.getColor());
		/*
		  car1.drive();
		  car1.setColor("Rot"); //setter -> accesses the attribute "color" and sets it to "red"
		  System.out.println(car1.getColor()); //getter -> gets the attribute "color" from the setter
		*/
	}
			
}
										/*
										
											A class is a blueprint for an object: We define a class and use it to describe an object, we give the object attributes/conditions and methods to describe it and all of
											this is recorded in a class

											The blueprint is used to create objects that have the same basic structure, but can differ in e.g. attributes (the class creates 5 identical cars or 5 cars 
											with 5 different colors)
											
											First letter of a class-file should always be written in capital letters -> better overview to find classes faster
											
											Any number of objects can be created by a class in a program

											Each object stands on its own and is independent after creation
											
											The keywords "public" and "private" are visibility modifier

											Files | "ClassCar.java" | "PropertiesAndAttributes.java" | "Constructor.java" | "MethodsOverloaded.java" | Legacy.java | ClassDog.java | ClassCat.java |
											| ClassAnimal.java | are related to file |"Classes.java"| and each other
										
										*/