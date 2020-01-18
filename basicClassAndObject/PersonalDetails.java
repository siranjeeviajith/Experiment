
 class PersonalDetails {
	int age;
	String name;
	String mobileNo;
	static {
		System.out.println("Class is loaded");
	}
	public PersonalDetails() {//Non Parameterized constructor; 
		
	}
	public PersonalDetails(String name,int age,String mobileNo) {//Parameterized constructor;
		this.name=name;
		this.age=age;
		this.mobileNo=mobileNo;
	}

}
