package in.sbp.networkbill.mainclass;

//import in.sbp.networkbill.classes.Airtel;
import in.sbp.networkbill.classes.*;
public class MainBillGenerator {
	public static void main(String[] args) {
		BillGenerator obj2 = new Airtel();
		Airtel obj1 = new Airtel();
		System.out.println("Your mobile bill is: "+ obj1.generateBill(150));
		obj2.method2();
		BillGenerator.method3();
		System.out.println(BillGenerator.number);
	}

}
  

// only access child class method not parent class method