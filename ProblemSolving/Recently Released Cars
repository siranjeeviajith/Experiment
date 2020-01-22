import java.util.*;
class Car{
    int year;
    String carName;
}
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		Map<String,Car> carRel = new HashMap<>();
		for(int ind=0;ind<N;ind++){
		    String company = sc.next();
		    String carN=sc.next();
		    int year=sc.nextInt();
		    
		    Car c=carRel.getOrDefault(company,new Car());
		    if(year>c.year){
		        c.year=year;
		        c.carName=carN;
		    }
		    carRel.put(company,c);
		   
		   
		}
		String[] arr=new String [carRel.size()];
		int ind=0;
		for(String st : carRel.keySet()){
		    Car c=carRel.get(st);
		    arr[ind++]=c.carName;
		}
		Arrays.sort(arr);
		for(String st:arr){
		    System.out.print(st+"\n");
		}

	}
}