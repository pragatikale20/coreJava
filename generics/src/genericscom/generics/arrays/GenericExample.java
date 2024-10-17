package genericscom.generics.arrays;

public class GenericExample {

	public static <T> void printArray(T[] inputArray) {
		for(T i : inputArray) {
			System.out.print(i);
		}
		System.out.println();
	}
}
