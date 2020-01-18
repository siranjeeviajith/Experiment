import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestingHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht =new Hashtable();//default capacity 11
		ht.put(10,"ram0");
		ht.put(20,"ram1");
		ht.put(30,"ram2");
		ht.put(40,"ram3");
		ht.put(50,"ram4");
		ht.put(60,"ram5");
		ht.put(70,"ram6");
		ht.put(80,"ram7");
		ht.put(90,"ram8");
		/*     Debugging output before adding 8 th element   */
		/*put() returned	null	
args	String[0]  (id=25)	
ht	Hashtable<K,V>  (id=33)	
	count	8	
	entrySet	Collections$SynchronizedSet<E>  (id=944)	
	keySet	null	
	loadFactor	0.75	
	modCount	8	
	table	Hashtable$Entry<K,V>[11]  (id=40)	
		[0]	null	
		[1]	null	
		[2]	null	
		[3]	Hashtable$Entry<K,V>  (id=58)	
			hash	80	
			key	Integer  (id=57)	
			next	null	
			value	"ram7" (id=932)	
		[4]	Hashtable$Entry<K,V>  (id=56)	
			hash	70	
			key	Integer  (id=55)	
			next	null	
			value	"ram6" (id=957)	
		[5]	Hashtable$Entry<K,V>  (id=54)	
			hash	60	
			key	Integer  (id=53)	
			next	null	
			value	"ram5" (id=972)	
		[6]	Hashtable$Entry<K,V>  (id=52)	
			hash	50	
			key	Integer  (id=51)	
			next	null	
			value	"ram4" (id=987)	
		[7]	Hashtable$Entry<K,V>  (id=50)	
			hash	40	
			key	Integer  (id=49)	
			next	null	
			value	"ram3" (id=993)	
		[8]	Hashtable$Entry<K,V>  (id=45)	
			hash	30	
			key	Integer  (id=44)	
			next	null	
			value	"ram2" (id=1008)	
		[9]	Hashtable$Entry<K,V>  (id=47)	
			hash	20	
			key	Integer  (id=43)	
			next	null	
			value	"ram1" (id=1023)	
		[10]	Hashtable$Entry<K,V>  (id=48)	
			hash	10	
			key	Integer  (id=39)	
			next	null	
			value	"ram0" (id=1052)	
	threshold	8	
	values	null	
	

       */
		ht.put(100,"ram9");
		ht.put(110,"ram10");
		ht.put(120,"ram11");
		/* After exceeding threshold value:
		 * debug output:
		 * put() returned	null	
args	String[0]  (id=25)	
ht	Hashtable<K,V>  (id=33)	
	count	9	
	entrySet	Collections$SynchronizedSet<E>  (id=944)	
	keySet	null	
	loadFactor	0.75	
	modCount	10	
	table	Hashtable$Entry<K,V>[23]  (id=1089)	
		[0]	null	
		[1]	Hashtable$Entry<K,V>  (id=56)	
			hash	70	
			key	Integer  (id=55)	
			next	null	
			value	"ram6" (id=957)	
		[2]	null	
		[3]	null	
		[4]	Hashtable$Entry<K,V>  (id=52)	
			hash	50	
			key	Integer  (id=51)	
			next	null	
			value	"ram4" (id=987)	
		[5]	null	
		[6]	null	
		[7]	Hashtable$Entry<K,V>  (id=45)	
			hash	30	
			key	Integer  (id=44)	
			next	null	
			value	"ram2" (id=1008)	
		[8]	null	
		[9]	null	
		[10]	Hashtable$Entry<K,V>  (id=48)	
			hash	10	
			key	Integer  (id=39)	
			next	null	
			value	"ram0" (id=1052)	
		[11]	Hashtable$Entry<K,V>  (id=58)	
			hash	80	
			key	Integer  (id=57)	
			next	null	
			value	"ram7" (id=932)	
		[12]	null	
		[13]	null	
		[14]	Hashtable$Entry<K,V>  (id=54)	
			hash	60	
			key	Integer  (id=53)	
			next	null	
			value	"ram5" (id=972)	
		[15]	null	
		[16]	null	
		[17]	Hashtable$Entry<K,V>  (id=50)	
			hash	40	
			key	Integer  (id=49)	
			next	null	
			value	"ram3" (id=993)	
		[18]	null	
		[19]	null	
		[20]	Hashtable$Entry<K,V>  (id=47)	
			hash	20	
			key	Integer  (id=43)	
			next	null	
			value	"ram1" (id=1023)	
		[21]	Hashtable$Entry<K,V>  (id=1133)	
			hash	90	
			key	Integer  (id=1088)	
			next	null	
			value	"ram8" (id=1144)	
		[22]	null	
	threshold	17	
	values	null	

		 */
		
		
		Map ht1=new HashMap<>();//default Capacity
		
		ht1.put(11,"ram0");
		ht1.put(12,"ram1");
		ht1.put(23,"ram2");
		ht1.put(34,"ram3");
		ht1.put(45,"ram4");
		ht1.put(56,"ram5");
		ht1.put(67,"ram6");
		ht1.put(78,"ram7");
		ht1.put(89,"ram8");
		ht1.put(100,"ram9");
	ht1.put(111,"ram10");
	  ht1.put(122,"ram11");
	  ht1.put(130,"ajith");
	  ht1.put(140,"raj");
	  ht1.put(150,"hari");
	  ht1.put(160,"rubesh");
	  ht1.put("hi","kannan");
		
		System.out.println(ht);
		System.out.println(ht1);
	
	}

}
