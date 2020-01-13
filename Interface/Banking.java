
public class Banking implements CreateAccount{
	int age;
	float curBalance=0;
	String name,mobileNo,address;
	String accountType;
	final int minimumBalance=1000;
	Banking(String name,int age,String mobileNo,String address,String accountType,float curBalance){
		this.name=name;
		this.age=age;
		this.mobileNo=mobileNo;
		this.address=address;
		this.accountType=accountType;
		this.curBalance=curBalance;
	}
	public void getUserDetails() {
		System.out.println("UserName:"+name+" Age:"+age+" MobileNo:"+mobileNo+" Address:"+address);
	}
	public void getAccountType() {
		System.out.println("Account Type: "+accountType);
	}
    public void getMinimumBalance() {
    	System.out.println("Minimum Balance:"+minimumBalance);
    	
    }
    public void showCurrentBalance() {
    	System.out.println("Current Balance in your Account:"+curBalance);
    }
}
