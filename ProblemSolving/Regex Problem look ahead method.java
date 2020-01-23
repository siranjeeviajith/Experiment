import java.util.*;
import java.util.regex.*;
public class Hello {
   
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pattern pattern=Pattern.compile("(\\b\\w+([ ]+|$))(?![aeiouAEIOU])");
		
		String str=sc.nextLine();
		Matcher match=pattern.matcher(str);
		while(match.find()){
		    System.out.println(match.group(1));
		}
	    
	}
}
