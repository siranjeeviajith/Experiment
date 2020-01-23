import java.util.*;
import java.util.regex.*;
public class Hello {
   
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pattern pattern=Pattern.compile("(\\+\\d+)-(\\d+)-(\\d+)");
		int N=sc.nextInt();sc.nextLine();
		for(int ind=0;ind<N;ind++){
		String str=sc.nextLine();
		Matcher match=pattern.matcher(str);
	    if(match.find()){
	        System.out.println("Country:"+match.group(1)+"\nCity:"+match.group(2)+"\nNumber:"+match.group(3));
	    }}
	}
}
