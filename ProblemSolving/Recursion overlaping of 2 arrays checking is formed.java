import java.util.*;

public class Hello {
    static void getArray(int arr[],Scanner sc){
        for(int ind=0;ind<arr.length;ind++){
            arr[ind]=sc.nextInt();
        }
    }
    static boolean isFormed(int arr1[],arr2[],int preVal,int index1,int index2){
        if(index1==arr1.length && index2==arr2.length){
           
            return true;
        }
        if(index1<arr1.length && preVal%2 != arr1[index1]%2){
          
            if(isFormed(arr1,arr2,arr1[index1],index1+1,index2){
                return true;
            }
        }
        if(index2<arr2.length && preVal%2!= arr2[index2]){
            if(isFormed(arr1,arr2,arr2[index2],index1,index2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr1=new int[N];
        int[] arr2=new int[N];
        getArray(arr1,sc);
        getArray(arr2,sc);
        System.out.print(isFormed(arr1,arr2,0,0,0));
        
      
    }
}