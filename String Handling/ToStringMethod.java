
public class ToStringMethod {
	String student;
	int rollNo=0;
	int age=0;
	public ToStringMethod(String name,int rollNo,int age){
		this.student=name;
		this.rollNo=rollNo;
		this.age=age;
	}
	public String toString() {
		return "RollNo:"+rollNo+" Name:"+student+" Age:"+age;
		
	}
		
}
