package in.sbp.abstraction.residency.mainclass;
import in.sbp.abstraction.residency.classes.*;
import in.sbp.abstraction.industrialresidency.*;
public class MainResidency {
	public static void main(String[] args) {
		Residency obj1 = new IndustrialRecidency();
		System.out.println("your electricity bill is: "+ obj1.generateRecidency(100));
	}
	

}
