package entities;

public class Student {

	private int rollNo;
	private String name;
	private int age;
	
	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		
		
	}
	

//	@Override
//	public int compareTo(Student obj) {
//		//return this.rollNo-obj.rollNo;
//		//Integer.Compare(this.rollNo , obj.rollNo);
//		//return this.name.compareTo(obj.name);
//		return obj.age-this.age;
//		
//	}
//    
	public String toString() {
	return ("Roll No: " + rollNo + "   Name : " + name + "   Age:  " +age);
}
}
