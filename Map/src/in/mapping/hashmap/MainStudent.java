package in.mapping.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MainStudent {

	public static void main(String[] args) {
		Map<Student , Double> studentFees = new HashMap<>();
		
		studentFees.put(new Student("Pragati" ,1 ), 100.0D);
		studentFees.put(new Student("Divya" ,9 ), 1200.0D);
		studentFees.put(new Student("Namrata" ,3 ), 500.0D);
		studentFees.put(new Student("Sakshi" ,4 ), 1000.0D);
		studentFees.put(new Student("Sneha" ,2 ), 3100.0D);
		studentFees.put(new Student("Sneha" ,7 ), 3100.0D);
		
		
		for(Entry<Student, Double> entry : studentFees.entrySet())
			System.out.println(entry);
		
//		System.out.println(studentFees.containsKey(new Student("Pragati" ,1 )));
//		System.out.println(studentFees.containsValue(new Student("Namrata" ,3 )));
//		System.out.println(studentFees.remove(new Student("Pragati" ,1 )));
//		System.out.println(studentFees.get(new Student("Pragati" ,1 )));
//	
//		double fee = studentFees.compute(new Student("Pragati" ,1), (k,v) -> v + 1000.0D);
//	    System.out.println(fee);
//		
//		Iterator<Student> studIterator = studentFees.keySet().iterator();
//		while(studIterator.hasNext())
//		{
//			System.out.println(studentFees.compute(studIterator.next(), (k,v) -> v + 1000.0D));
//		}
//		
//		studentFees.clear();
//		System.out.println(studentFees);
		
	}
}
