import java.util.*;
import java.util.regex.*;
public class Hello {
   
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int S=sc.nextInt();
		Pattern pattern=Pattern.compile("\\s+\\w+-(\\w+)");
		Map<String,List<String>> map =new HashMap<>();
		for(int ind=0;ind<N;ind++){
		    String str=sc.next();
		    String str1=sc.nextLine();
		    
		    Matcher match=pattern.matcher(str1);
		    while(match.find()){
		        if(!str.equals(match.group(1))){
		            List<String> points=map.getOrDefault(match.group(1),new ArrayList<>());
		            points.add(match.group(1));
		            map.put(str,points);
		        }
		       
		    }
		    
		}
		for(String str:map.keySet()){
		    System.out.println(str+":"+map.get(str));
		}
		
		
	    
	}
}
// 5 4
// P1 a1-P2 a2-P3
// P2 a1-S1 a2-P3
// p3 
// P4 c1-P4 c2-P4 c3-S3 c4-S4
// P5 a1-S2 s2-S3 a6-S1
