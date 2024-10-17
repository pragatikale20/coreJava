package com.generics.upperbiunds;
import java.util.List;
import java.util.ArrayList;

public class MainGenericWildCard {
	
public static void main(String[] args) {
	
	List<Number> intList = new ArrayList<>();
	intList.add(5);
	intList.add(4);
	intList.add(9);
	intList.add(6);
	intList.add(1);
	System.out.println("Upper Bound List : ");
	upperBoundWildCard(intList);
	
	System.out.println("Lower Bound List");
	lowerBoundWildCard(intList);
	
	System.out.println("The unbound list : ");
	unBoundWildCard(intList);
	
}

public static void upperBoundWildCard(List<? extends Number > upperBoundList) {
upperBoundList.forEach(System.out::println);       
//consumer return nothing ...and producer doesn't consumes nothing 
}

public static void lowerBoundWildCard(List<? extends Number > lowerBoundList) {
	for(Object val: lowerBoundList) 
		System.out.println(val);
	
}

public static void unBoundWildCard(List<? extends Number > unBoundList) {
	for(int i = 0; i<unBoundList.size() ; i++) {
		System.out.println(unBoundList.get(i));
		
		
	}
	
}
}
