
class MainCLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Animal();
		Dog labrador=new Dog("Dog","LabradorDog",6);
		Cat newCat=new Cat("Cat","newCat",4);
		obj.showAnimalDetails(obj);
		labrador.showAnimalDetails(labrador);
		newCat.showAnimalDetails(newCat);

	}

}
