
public class Dog extends Animal {
	Dog(){
		System.out.println("Dog");
	}
	Dog(String type,String name,int age){
		this.animalType=type;
		this.animalName=name;
		this.animalAge=age;
		
	}
	{
		System.out.println("instance block");
	}
	
   
}
