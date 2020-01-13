
public class HelloClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj1=new Encapsulation();
		obj1.setName("Mr.X");
		obj1.setAge(22);
		obj1.setMobileNo("34324233");
		Encapsulation obj2=new Encapsulation();
		obj2.setName("Mr.Y");
		obj2.setAge(25);
		obj2.setMobileNo("243245332");
		System.out.println("Person 1 Name-"+obj1.getName()+" Age-"+obj1.getAge()+" MobileNo-"+obj1.getMobileNo());
		System.out.println("Person 2 Name-"+obj2.getName()+" Age-"+obj2.getAge()+" MobileNo-"+obj2.getMobileNo());
		

	}

}
