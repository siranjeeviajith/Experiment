import java.util.*;
class Players{
    int pId;
    int pTime;
    int pPos;
    int elimin=0;
}
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int B=sc.nextInt(),P=sc.nextInt();
		List<Players> players=new ArrayList<>();
		for(int ind=0;ind<P;ind++)
        {
            Players pl=new Players();
            pl.pId=sc.nextInt();
            players.add(pl);
        }
        
            for(Players p:players){
                p.pTime=sc.nextInt();
            }
        for(Players p:players){
            p.pPos=sc.nextInt();
            
        }
        int M=sc.nextInt();
        int[] music=new int[M];
        for(int ind=0;ind<M;ind++){
            music[ind]=sc.nextInt();
        }
        int[] bench=new int[M];
        for(int ind=0;ind<M;ind++){
            bench[ind]=sc.nextInt();
            
        }
        
        List<Integer> b=new ArrayList<>();
        for(int ind=1;ind<=B;ind++){
            b.add(ind);
        }
        for(int ind=0;ind<M;ind++){
            for(Players p:players){
                if(p.elimin!=1 ){
                int mt=music[ind];
               int plp=(b.indexOf(p.pPos)+(mt/p.pTime))%(mt/p.pTime);
               p.pPos=b.get(plp);
                    System.out.print(b.get(plp)+":"+bench[ind]+" ");
                if(p.pPos==bench[ind]){
                    p.elimin=1;
                }
                  //  System.out.print(b.get(plp)+":"+b.indexOf(bench[ind])+" ");
                
                }
            }
            System.out.println();  
               b.remove(b.indexOf(bench[ind]));
            
            
        }
        for(Players p:players ){
            if(p.elimin!=1){
                //System.out.print(p.pId+":"+p.pPos+" ");
            }
        }
        
	}
}
// 10 6
// 100 200 300 400 500 600
// 2 3 4 2 5 3
// 9 8 9 5 2 1
// 5
// 60 120 180 60 60
// 4 5 3 6 7