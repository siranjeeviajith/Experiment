
public class Cat extends Animal {
	public Cat() {
		System.out.println("cat");
	}
	Cat(String type,String name,int age){
		this.animalAge=age;
		this.animalName=name;
		this.animalType=type;
	}

}
