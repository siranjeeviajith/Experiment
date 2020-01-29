
 class Animal {
	String animalName;
	String animalType;
	int animalAge=0;
	public Animal() {
		animalName="Name";
		animalType="Type";
		animalAge=0;
		System.out.println("parent Constructor");
	}
	void showAnimalDetails(Animal obj) {
		System.out.println("Animal Type:"+obj.animalType+" AnimalName:"+obj.animalName+" AnimalAge:"+obj.animalAge);
	}
	static void printStatic() {
		System.out.println("Parent Static method");
	}

}
