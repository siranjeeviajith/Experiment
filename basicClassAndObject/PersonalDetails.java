
 class PersonalDetails {
	static int age;
	String name;
	String mobileNo;
	static void show(){
		System.out.println("static is loaded");
	}
	public PersonalDetails() {//Non Parameterized constructor; 
		
	}
	public PersonalDetails(String name,int age,String mobileNo) {//Parameterized constructor;
		this.name=name;
		this.age=age;
		this.mobileNo=mobileNo;
		
	}
	public void callStatic() {
		
	}

}
