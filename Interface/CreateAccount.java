
public interface CreateAccount {
      //  void getUserDetails();
	int A=10;
        void getAccountType();
        void getMinimumBalance();
        void showCurrentBalance();
        default void getUserDetails() {System.out.println("EnterNAmes");
        	
        }
        static void printStatic() {
        	System.out.println("Interface 1 Static method");
        }
       
}
