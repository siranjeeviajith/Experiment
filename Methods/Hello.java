
class Hello {
	int data;
	String name;
	private Hello(String name,int data) {//private Contrsuctor
		this.data=data;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass obj=new NewClass();
		obj.methodCalling();
		Hello obj2=new Hello("Mr.X",321);
		System.out.println(obj2.name+" "+obj2.data);

	}

}
