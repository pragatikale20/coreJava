package genericscom.generics.arrays;

public class MainGenericExample extends GenericExample{
	
	
public static void main(String[] args) {
	GenericExample obj = new GenericExample();
	
	Integer[] intArray = {1,2,3,4,5,6,7};
	Double [] doubleArray = {1.1, 1.2, 1.3, 1.4};
	Character [] charArray = {'a', 'b', 'c'};
	printArray(intArray);
	printArray(doubleArray);
	printArray(charArray);
}

}
