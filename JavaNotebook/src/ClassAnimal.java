
public class ClassAnimal { //ClassAnimal is in this case a ParentClass/SuperClass for ClassDog and ClassCat
	
	private String name;
	private int age;
		
	public void sleep() {
		System.out.println("Schlafen...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
/*
	Files | "ClassCar.java" | "PropertiesAndAttributes.java" | "Constructor.java" | "MethodsOverloaded.java" | Legacy.java | ClassDog.java | ClassCat.java |
	| ClassAnimal.java | are related to file |"Classes.java"| and each other
*/