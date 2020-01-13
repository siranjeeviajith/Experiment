
public class Overload {
	int data=0;
	String name=null;
	String Mobile=null;
	float assets=0;
	Void showDetails(int data) {
		System.out.println("Data:"+data);
		return null;
	}
	void showDetails(float assets) {
		System.out.println("Assets:"+assets);
	}
	void showDetails(String name) {
		System.out.println("Name:"+name);
	}

}
