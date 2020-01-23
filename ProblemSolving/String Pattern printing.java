import java.util.*;
public class Hello {
    
     static String getNextString(char ch,String words[]){
        for(int ind=0;ind<3;ind++){
            if(ch==words[ind].charAt(0)){
                return words[ind];
            }
            
        }
        return "";
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String top=sc.next();
		String words[]=new String[3];
		words[0]=sc.next();
		words[1]=sc.next();
		words[2]=sc.next();
		String right=getNextString(top.charAt(top.length()-1),words);
		String bottom=getNextString(right.charAt(right.length()-1),words);
		String left=getNextString(bottom.charAt(bottom.length()-1),words);
		System.out.print(top+"\n"+right+"\n"+left+"\n"+bottom);
		
	}
}