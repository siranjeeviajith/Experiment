import java.util.*;
public class Hello {
    
    static void dfs(Map<Integer,Set<Integer>> map,int node,boolean[] visited){
        Stack <Integer> stack=new Stack<>();
        stack.push(node);
        visited[node]=true;
        while(!stack.isEmpty()){
            node=stack.pop();
        
            System.out.print(node+" ");
            
            for(int value:map.get(node)){
                if(!visited[value]){
                    stack.push(value);
                    visited[value]=true;
                }
            }
            
        }
                
    }
    
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
		int count=0;
		boolean visited[]=new boolean[map.size()+1];
		
		for(int key:map.keySet()){
		   if(!visited[key]){
		       dfs(map,key,visited);
		       count++;
		   }
		}
		System.out.print("\nNo of graph:"+count);

	}
}