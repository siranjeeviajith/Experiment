import java.util.ArrayList;
import java.util.List;

public class Arrays {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
	    List<Integer> num=new ArrayList<>();
	    for(int ind=a.get(a.size()-1);ind<=b.get(0);ind++){
	        int count=0;
	        for(int ind1=0;ind1<a.size();ind1++){
	                    if(ind%a.get(ind1)==0){
	                        count++;
	                    }else{
	                        break;
	                    }
	        }if(count==a.size()){
	            num.add(ind);
	        }
	    }
	    for(int ind=0;ind<num.size();ind++){
	         for(int ind1=0;ind1<b.size();ind1++){
	             if(b.get(ind1)%num.get(ind)!=0){
	                 num.remove(ind);
	                 break;
	             }
	        }
	    }
	    System.out.println(num);
	    return num.size();

	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float[] fb=new float[9];
     fb[0]=(int)12;
     fb[1]=(byte)13;
     fb[2]=(short)8;
     fb[3]=12.021f;
    // fb[4]=23443.43d;
//     fb[4]='a';
//     for(int i=0;i<=4;i++) {
//    	 System.out.println(fb[i]);
//     }
     List<Integer> lis1=new ArrayList<>();
     List<Integer> lis2=new ArrayList<>();
     lis1.add(2);
     lis1.add(4);
     lis2.add(16);
     lis2.add(32);
     lis2.add(96);
     long startTime = System.currentTimeMillis();
     getTotalX(lis1,lis2);
     System.out.println("Time taken by 2 * o(n^2) " + (System.currentTimeMillis() - startTime) + "ms");  
     
    		 
	}

}
