
public class Animal {
	String animalName="Animal";
	String animalType="undefined";
	int animalAge=0;
	void showAnimalDetails(Animal obj) {
		System.out.println("Animal Type:"+obj.animalType+" AnimalName:"+obj.animalName+" AnimalAge:"+obj.animalAge);
	}
	static void printStatic() {
		System.out.println("Parent Static method");
	}

}
