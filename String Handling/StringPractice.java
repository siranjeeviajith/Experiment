import java.util.StringTokenizer;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sachin";  
		s=s.concat(" Tendulkar");  
		System.out.println(s); // s points to the "Sachin Tendulkar".still sachin object is not modified
		String s1="sachin";
		String s2="SACHIN";  
	    System.out.println(s1.equals(s2));//false  
		System.out.println(s1.equalsIgnoreCase(s2));//true  
		String s3=new String("Sachin");  
		System.out.println(s==s3);//false(because s3 refers to instance created in nonpool)  
		s1="Ratan";
		System.out.println(s1.compareTo(s1));//0  
		System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		String s4=(new StringBuilder()).append("Sachin").append(" Tendulkar").toString();//In java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and its append method;
		System.out.println(s4);
		System.out.println(s.substring(6));//Tendulkar  
		System.out.println(s.substring(0,6));//Sachin 
		s="Sachin";
		System.out.println(s.toUpperCase());//SACHIN  
		System.out.println(s.toLowerCase());//sachin  
		System.out.println(s);//Sachin(no change in original)
		System.out.println(s.startsWith("Sa"));//true  
		System.out.println(s.endsWith("n"));//true  
		int a=10;  
		String s5=String.valueOf(a);  
		System.out.println(s5+10);
		s5="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s5.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString);
		//String Builder use to create mutable string
		StringBuffer sb=new StringBuffer(""); 
		System.out.println("initial:"+sb.capacity());
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		sb.reverse();//reverse a string
		System.out.println(sb);
		sb.reverse();
		sb.insert(1,"Java");//now original string is chan
		System.out.println(sb);//prints HJavaello
		System.out.println(sb.capacity());
		sb.ensureCapacity(35);
		System.out.println(sb.capacity());
		sb.delete(1,5);  
		System.out.println(sb);//Java is deleted,prints "Hello Java"
		StringBuilder sb1=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("Hello");
		System.out.println(sb1.equals("Hello"));//false
		System.out.println();
		
		PerformanceTests test1=new PerformanceTests();//performance difference between String,String Builder and String buffer
		/*Time taken by StringBuffer: 11ms
Time taken by StringBuilder: 9ms
Time taken by Concating with String: 248ms */
		
		test1.checkPerformance();
		//Experiment with toString() Method
		ToStringMethod st1=new ToStringMethod("MR.X",101,23);
		ToStringMethod st2=new ToStringMethod("MR.Y",102,25);
		System.out.println(st1);
		System.out.println(st2);
		////String s9=st1.intern();
		//System.out.println("USing Intern:"+s9);
		/* Prints:
		 * RollNo:101 Name:MR.X Age:23
           RollNo:102 Name:MR.Y Age:25
		 */
		//String Tokenizer
		StringTokenizer st = new StringTokenizer("my,name is khan",", ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	         /*Prints : my
	         name
	         is
	         khan */
	     }
	     String s6=new String("Test34");
	     String s8=s6;
	    // String s7=s6.intern();////process to store a string object from heap to string pool memory 
	   //  System.out.println(s6==s7);//false
	     System.out.println(s6==s8);
	}

}

