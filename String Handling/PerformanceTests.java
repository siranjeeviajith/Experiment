
public class PerformanceTests {
	public void checkPerformance() {
		 long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	        String t = "Java";  
	        startTime = System.currentTimeMillis();    
	        for (int i=0; i<10000; i++){  
	            t = t + "Tpoint";  
	        }
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis())+"ms");  
	}

}
