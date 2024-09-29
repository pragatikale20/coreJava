package in.sbp.abstraction.classes;

public class Operation extends Transaction {
	//private int bal;
     //public Operation(int bal) {
	//super(bal);
     //}
	@Override
	public void debitAmount(float amount) {
		bal-=amount;
		
	}
	@Override
	public void creditAmount(float amount) {
		bal+=amount;
		
	}
	public void checkBalance(){
		
		
	}

}
