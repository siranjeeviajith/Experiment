
public class HelloCls {

	public static void main(String[] args) {
		AnimalCL obj =new AnimalCL();
		AnimalCL dog=new DogCL();
		AnimalCL newCat=new CatCL();
		obj.animalSpeaks();
		dog.animalSpeaks();
		newCat.animalSpeaks();
	}

}
