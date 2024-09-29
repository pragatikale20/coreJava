package in.sbp.abstraction.industrialbill;
import in.sbp.abstraction.billgenerator.*;
import in.sbp.abstraction.billgenerator.mainclass.*;
public class IndustrialBill extends Bill {
//	public IndustrialBill() {
//		super();
//	}
	@Override
	public float generateBill(int units) {
//		float amount=units*16.30f;
//		return amount;
		return units*16.30f;
	}

}
