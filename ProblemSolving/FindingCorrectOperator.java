import java.util.*;
public class FindingCorrectOperator {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Scanner scan=new Scanner(str);
		String ch=scan.findInLine("[+-/*/]");
		String[] str1=str.split(ch);
		String[] str2=str1[1].split("=");
		int A=Integer.parseInt(str1[0]);
		int B=Integer.parseInt(str2[0]);
		int C=Integer.parseInt(str2[1]);
		String op="";
		if(A+B==C){
		    op="+";
		}
		else if(A-B==C){
		    op="-";
		}
		else if(A/B==C){
		    op="/";
		}
		else {
		    op="*";
		}
	System.out.print(ch);

	}
}