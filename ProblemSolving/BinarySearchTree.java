import java.util.*;
class Node{
    int value;
    Node left,right;
}
public class BinarySearchTree {
    static void preOrder(Node curr){
        if(curr!=null){
            System.out.print(curr.value+" ");
            preOrder(curr.left);
            preOrder(curr.right);
        }
    }
    static void postOrder(Node curr){
        if(curr!=null){
            postOrder(curr.left);
            postOrder(curr.right);
            System.out.print(curr.value+" ");
        }
    }
    static void inOrder(Node curr){
        if(curr!=null){
            inOrder(curr.left);
            System.out.print(curr.value+" ");
            inOrder(curr.right);
        }
    }
   static Node root=null;
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int ind=0;ind<N;ind++){
		    int val=sc.nextInt();
		    insertNode(val);
		}
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		inOrder(root);
		
	

	}
	static void insertNode(int val){
	    Node curr=root;
	    Node newNode=new Node();
	    newNode.value=val;
	    if(root==null){
	       root =new Node();
	       root.value=val;
	       return;
	    }
	    while(true){
	        if(curr.value<val){
	            if(curr.right==null){
	            curr.right = new Node();
	            curr.right.value=val;
	            return;
	        }else{
	            curr=curr.right;
	        }
	        }else{
	            if(curr.left == null){
	                curr.left= new Node();
	                curr.left.value=val;
	                return;
	            }
	            curr=curr.left;
	            
	        }
	    }
	    
	}
}