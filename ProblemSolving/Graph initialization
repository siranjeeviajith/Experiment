import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int E=sc.nextInt();
		int N=sc.nextInt();
		Map<Integer,Set<Integer>> map=new HashMap<>();
		for(int ind=0;ind<E;ind++){
		    int row=sc.nextInt(),col=sc.nextInt();
		    Set <Integer> lis;
		    lis=map.getOrDefault(row,new HashSet<>());
		    lis.add(col);
		    map.put(row,lis);
		    lis=map.getOrDefault(col,new HashSet<>());
		    lis.add(row);
		    map.put(col,lis);
		    
		}
		for(Integer val:map.keySet()){
		   Set<Integer> lis=map.get(val);
		    System.out.println(val+"->"+lis);
		}
		
	

	}
}