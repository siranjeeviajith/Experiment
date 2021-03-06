import java.util.*;
class Student{
     String name;
     Integer id;
     List <Integer> marks;
     Integer pass;
   
    public Student(){
            name="";
            id=0;
            marks=new ArrayList<>();
            pass=0;
            
    }
    public Student(String name,int id,List<Integer> marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
        checkPass(this.marks);
    }
    public String getName(){
        return name;
    }
    public Integer getId(){
        return id;
    }
    public List getMarks(){
        return marks;
    }
    public Integer getPass(){
        return pass;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setMarks(List<Integer> marks){
        this.marks=marks;
    }
    public void checkPass(List<Integer> marks){
        int flag=1;
        for(int mark:marks){
            if(mark<40){
                flag=0;
                break;
            }
        }
        if(flag==1){
            this.pass=1;
            
        }
        else{
            this.pass=0;
           
        }
        
    }
    
}
public class ClassAndObject {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<Student> list=new ArrayList<>();
		for(int ind=0;ind<N;ind++){
		    
		    String name=sc.next();
		    int id=sc.nextInt();
		    List<Integer> marks=new ArrayList<Integer>();
		    for(String ch:sc.nextLine().trim().split(" ")){
		        marks.add(Integer.parseInt(ch));
		    }
		    Student st = new Student(name,id,marks);
            list.add(st);		    
		}
		System.out.println("Passed:");
		for(Student st:list){
		    if(st.getPass()==1){
		        System.out.println(st.name+" "+st.id+" "+st.marks);
		    }
		}
		System.out.println("Failed:");
// 		for(Student st: list){
// 		    if(st.getPass()==0){
// 		        System.out.println(st.getName()+" "+st.getId()+" "+st.getMarks());
// 		    }
// 		}
	}
}