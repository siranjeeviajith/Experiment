
public class TestExceptionPropagation {
	void m(){  
	    int data=50/0;// this unchecked exception is handled in p method.
	  //  throw new IOException("Checking with checked Exception");//compilation error
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println(e+" exception handled");}  
	  }  

}
