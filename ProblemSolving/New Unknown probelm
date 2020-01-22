import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int[] arr=new int[N];
	    int[] res=new int[N];
	    for(int ind=0;ind<N;ind++){
	        arr[ind]=sc.nextInt();
	    }
	    res[0]=arr[0];
	    res[1]=Math.max(arr[1],res[0]);
	    res[2]=Math.max(res[1],arr[2]);
	    for(int ind=3;ind<N;ind++){
	       res[ind]=Math.max(res[ind-3]+arr[ind],res[ind-1]);
	    }
	    for(int ind=0;ind<N;ind++){
	        
	    System.out.print(res[ind]+" ");
	    }

	}
}