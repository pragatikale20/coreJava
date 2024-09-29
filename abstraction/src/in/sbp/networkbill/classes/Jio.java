package in.sbp.networkbill.classes;

public class Jio implements BillGenerator {
	@Override 
	public float generateBill(int internateUsage) {
		return internateUsage * 7;
	}

}
