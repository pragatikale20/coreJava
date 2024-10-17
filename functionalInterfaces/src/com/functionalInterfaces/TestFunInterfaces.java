package com.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestFunInterfaces {

	public static void main(String[] args) {
		Consumer <String> strConsumer = (str)-> {System.out.println(str);};
		strConsumer.accept("Hiie");
		Consumer <String> string = (str)-> {System.out.println(str);};
		Consumer <String> string1 = (str)-> {System.out.println(str.length());};
		string1.accept("hello");
		
		//System.out.println(testSupplier(() -> Math.random()));
		
		
	}
	public static <T> void testConsumer(Consumer<String>string) {
		
		string.accept("Hello");
		string.accept("Hello");
		string.accept("Hello");
		
	}
	
	public static Integer testSupplier(Supplier<Integer> randomNum) {
		return randomNum.get();
		
	}
}
