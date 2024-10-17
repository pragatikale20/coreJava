package in.mapping.hashmap;

import java.util.Objects;

public class Employee {

	private String eName;
	private int eId;
	public Employee(String eName, int eId) {
		super();
		this.eName = eName;
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + "]";
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(eName,eId);
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj.getClass() != this.getClass())
		    return false;
		Employee emp = (Employee) obj;
		
		return (
				this.eName.equals(emp.eName)&&
				this.eId == emp.eId
				);
	}
}
