package in.mapping.hashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainEmployee {

	public static void main(String[] args) {
		
		Map<Employee , Double> empSalary = new LinkedHashMap<>();
		
		empSalary.put(new Employee("Pragati" , 20) ,10000D );
		empSalary.put(new Employee("Divya" , 15) ,40000D );
		empSalary.put(new Employee("Namrata" , 9) ,11000D );
		empSalary.put(new Employee("Sakshi" , 11) ,13000D );
		
		Iterator<Employee> empIterartor = empSalary.keySet().iterator() ;
		while(empIterartor.hasNext()) {
			empSalary.compute(empIterartor.next(), (k,v) -> v+ 1000.0D);
		}
		System.out.println(empSalary);
	}
}
