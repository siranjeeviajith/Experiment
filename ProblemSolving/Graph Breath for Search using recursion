import java.util.*;
public class Hello {
    static void bfs(int[][] mat,int node,boolean[] visited){
        
            
                
        for(int col=1;col<mat.length;col++){
            if(mat[node][col]==1 && visited[col]==false){
        
                
            }}
        for(int col=1;col<mat.length;col++){
            if(mat[node][col]==1 && visited[col]==false){
        
                System.out.print(col+" "+visited[col]+" ");
                visited[col]=true;
                bfs(mat,col,visited);
            }
    }
        
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] mat=new int[N+1][N+1];
		int row=0,col=0;
		for(row=1;row<N+1;row++){
		    for(col=1;col<N+1;col++){
		        mat[row][col]=sc.nextInt();
		    }
		}
		int node=sc.nextInt();
		System.out.print(node+" ");
		boolean[] visited =new boolean[N+1];
		visited[node]=true;
		bfs(mat,node,visited);
		System.out.print(mat.length);

	}
}