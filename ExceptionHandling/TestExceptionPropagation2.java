import java.io.IOException;

public class TestExceptionPropagation2 {
	void m()throws IOException,ArithmeticException{  
	    throw new IOException("device error");//checked exception 
		//throw new ArithmeticException();
	  }  
	  void n()throws IOException{  
	    m();  
	    
	  }  
	  void p(){  
	   try{  
	    n();  
	   }
	   catch(Exception e){
		   System.out.println(e+" exception handled");
	   } 
	   }
	  

}
