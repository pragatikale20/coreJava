package in.sbp.networkbill.classes;
//Functional Interface
public interface BillGenerator {
    float generateBill(int internateUsage);
	int number=10;
//	public void showMessage();
//	//abstract void method1 ();
	public default void method2() {
		System.out.println("Hello");
		method4();
	}
	public static void method3() {
		System.out.println("Static Method");
	}
	//after java 14 version
	private void method4() {
		System.out.println("Private method");
	}

}
