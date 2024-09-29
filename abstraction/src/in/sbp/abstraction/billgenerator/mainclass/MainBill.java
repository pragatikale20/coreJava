package in.sbp.abstraction.billgenerator.mainclass;
import in.sbp.abstraction.billgenerator.*;
import in.sbp.abstraction.industrialbill.*;
public class MainBill {
	public static void main(String[] args) {
		//Bill obj1 = new IndustrialBill();
		Bill obj1 = new IndustrialBill();
//		float amount =obj1.generateBill(100);
//		System.out.println("your electricity bill is: "+amount);
		System.out.println("your electricity bill is: "+ obj1.generateBill(100));
	}

}
