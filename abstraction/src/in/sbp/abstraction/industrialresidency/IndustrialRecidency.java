package in.sbp.abstraction.industrialresidency;
import in.sbp.abstraction.residency.classes.*;
import in.sbp.abstraction.residency.mainclass.*;
public class IndustrialRecidency extends Residency{
	@Override
	public float generateRecidency(int units) {
		return units*10.00f;
	}
	

}
