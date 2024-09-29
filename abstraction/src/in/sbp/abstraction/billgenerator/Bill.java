// their is no need of method or operations in abstract
// defining abstract method , method should be public
//their is no need of body abstract class 
//normal class we can define abstract class also constructor will be defined
//we have to import the operations which are not in java.lang
//abstract class object cannot instantiate
//abstract class object cannot be constructed
//this is current calling object
//constructor name and method name same use this
package in.sbp.abstraction.billgenerator;

public abstract class Bill {      
//	public abstract float generateBill(int units); 
//	private int number;
//	private final float PI;
//	public IndustrialBill(int number) {
//		PI =number;                    //lazy intialization
//	}
	public abstract float generateBill(int units);
}
