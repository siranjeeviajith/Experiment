import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt(),N=sc.nextInt();
		int mat[][]=new int[M][N];
		int row=0,col=0;
		for(row=0;row<M;row++){
		    for(col=0;col<N;col++){
		        mat[row][col]=sc.nextInt();
		    }
		}
        int leftStartRow=M-1,leftStartCol=0;
        int rightStartRow=0,rightStartCol=N-1;
        for(int ctr=0;ctr<(M+N)/2;ctr++){
            int leftRow=leftStartRow;
            int leftCol=leftStartCol;
            int rightRow=rightStartRow;
            int rightCol=rightStartCol;
            while(leftRow<M&&leftCol<N){
                int temp=mat[leftRow][leftCol];
                mat[leftRow][leftCol]=mat[rightRow][rightCol];
                mat[rightRow][rightCol]=temp;
                leftRow++;
                rightRow++;
                leftCol++;
                rightCol++;
            }
            if(leftStartRow!=0){
                leftStartRow--;
            }
            else{
                leftStartCol++;
            }
            if(rightStartCol!=0){
                rightStartCol--;
            }
            else{
                rightStartRow++;
            }
        }
        for(row=0;row<M;row++){
            for(col=0;col<N;col++){
                System.out.print(mat[row][col]);
            }System.out.println();
        }

	}
}