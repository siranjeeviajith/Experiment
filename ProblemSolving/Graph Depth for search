import java.util.*;
public class Hello {
    static void dfs(int[][] mat,int node,boolean[] visited){
        if(visited[node]==false){
        System.out.print(node+" ");
        visited[node]=true;
        for(int col=1;col<mat.length;col++){
            if(mat[node][col]==1){
                dfs(mat,col,visited);
            }
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
		boolean[] visited =new boolean[N+1];
		dfs(mat,node,visited);

	}
}