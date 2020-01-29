import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;

 class Main {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		
		PersonalDetails obj6=new PersonalDetails();
		
	//	System.out.println(obj6);
        //ways to create object
//		PersonalDetails obj1=new PersonalDetails();//using new Keyword;
//		PersonalDetails obj2=PersonalDetails.class.newInstance();//using newInstance keyWord;
////		Constructor<PersonalDetails> constructor = PersonalDetails.class.getConstructor();
////		PersonalDetails obj3 = constructor.newInstance();//Using Constructor Class;
//		//PersonalDetails obj4=(PersonalDetails) obj1.clone();//Using object.clone();
//		//ObjectInputStream inp = new ObjectInputStream(new FileInputStream("PersonalDetails"));
//		//PersonalDetails obj5 = (PersonalDetails) inp.readObject();//Using Deserialization-no Constructor call
//		/*Constructor overloading*/
//		PersonalDetails obj3=new PersonalDetails();//calling nonParameterized constructor
//	    PersonalDetails obj4=new PersonalDetails("MR.X",22,"2341211");//calling Parameterized constructor
//	    System.out.println(obj4.name+" "+obj4.age+" "+obj4.mobileNo);
//	    
//	    Main obj5=new Main();//calling Default constructor in main class
	
	obj6.callStatic();
	}
}
