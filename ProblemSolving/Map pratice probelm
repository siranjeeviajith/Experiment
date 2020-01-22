import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Map<String,List<Integer>> sMap=new HashMap<>();
	int N=sc.nextInt();
	for(int ind=0;ind<N;ind++){
	    String str=sc.next();
	    List<Integer> score= new ArrayList<>();
	    for(String s : sc.nextLine().trim().split(" ")){
	        score.add(Integer.parseInt(s));
	    }
	    sMap.put(str,score);
	}
	for(String name : sMap.keySet()){
	    System.out.print(name+" ");
	    List<Integer>score=sMap.get(name);
	    for(Integer s : score){
	        System.out.print(s+" ");
	    }
	    System.out.println();
	}

	}
}