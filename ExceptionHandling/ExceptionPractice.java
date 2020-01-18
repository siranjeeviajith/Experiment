import java.io.IOException;

public class ExceptionPractice {
	public static void validate(String s) {
		try {
			throw new CustomException(s);
		}catch(Exception e) {
			System.out.println(e+" -custom Exception...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
		      //code that may raise exception  
		     // int data=100/0;//ArithmeticExeption  
		      String s=null;  
		      System.out.println(s.length());//NullPointerException
		     // throw new IOException("Check it is catched!");//checked exception are catched;
		   }catch(Exception e){System.out.println(e);}  
		   //rest code of the program   
		   System.out.println("rest of the code...");
		   try{    
			    int a[]=new int[5];    
			    a[5]=30/0;    
			   }    
			   catch(Exception e){System.out.println(e+" common task completed");}    
			   //catch(ArithmeticException e){System.out.println("task1 is completed");} 
		   /*  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception

			at ExceptionPractice.main(ExceptionPractice.java:19) */
			   //catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
			   System.out.println("rest of the code...");  
			   try{  
				   int data=25/5;  //IF 25/0 ,it rises Arithmatic exception and it executes finally block
				   System.out.println(data);  
				  }  
				  catch(NullPointerException e){System.out.println(e);}  
				  finally{System.out.println("finally block is always executed");}  
				  System.out.println("rest of the code...");  
			int age=15;
				  if(age<18)  {
				     // throw new ArithmeticException("not valid");  ///will throw a Arithmatic Exception explicitly;
				     System.out.println("Flow is Continued");  
				  }else  
				      System.out.println("welcome to vote");  
				  
		/*Lets Check Exception Propagation in another class, by creating object in this class*/
				  TestExceptionPropagation object=new TestExceptionPropagation();
				  object.p();
				  System.out.println("Exception is catched and normal flow is continued!");
				  /*Now checked Exception can be forwarded using  THrows*/
				  TestExceptionPropagation2 object2=new TestExceptionPropagation2();
				  object2.p();
				  /*1) Rule: If the superclass method does not declare an exception, 
				   * subclass overridden method cannot declare the checked exception..*/
				  
				   /*2) Rule: If the superclass method does not declare an exception, 
				    * subclass overridden method cannot declare the checked exception but can declare unchecked exception.*/
				  ParentClass p=new ChildClass();  //rise compile error if it applies above rule.
				  // try{  
				  // p.msg();  
				  // }catch(Exception e){}   
				   /* Custom Exeception implemented.*/
				   validate("Custom Exception is Executed..");

	}

}
