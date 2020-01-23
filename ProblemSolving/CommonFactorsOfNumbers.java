import java.util.*;
public class CommonFactorsOfNumbers {
    static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int result=sc.nextInt();
		for(int ctr=2;ctr<=N;ctr++){
		    int nextVal=sc.nextInt();
		    result=GCD(nextVal,result);
		    
		}

	}
}