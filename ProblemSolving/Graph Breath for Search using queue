import java.util.*;
public class Hello {
    static void bfs(Map<Integer,Set<Integer>> map,int node,int arr[]){
        Queue<Integer> queue= new LinkedList<>();
        int count=0;
        boolean visited[]=new boolean[map.size()+1];
        queue.add(node);
        arr[node]=0;
        visited[node]=true;
        while(!queue.isEmpty()){
            node=queue.poll();
            //System.out.print(node+" ");
            
            for(int neighbor:map.get(node)){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor]=true;
                arr[neighbor]=arr[node]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int E=sc.nextInt();
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
		int node=sc.nextInt();
		int[] arr=new int[map.size()+1];
		bfs(map,node,arr);
		for(int ind=1;ind<arr.length;ind++){
		    System.out.println(node+"->"+ind+"="+arr[ind]+" ");
		}
		
		
	

	}
}