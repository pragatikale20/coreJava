package in.mapping.hashmap;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name ;
	private int rollNo;
	
	
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo =rollNo;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(name,rollNo);
	}
	
	@Override
	public boolean equals (Object obj) {
		
		if(obj == null) {
			return false;
		}
		if(obj.getClass() != this.getClass())
		    return false;
		
		Student stud = (Student) obj;
		return(
				this.name.equals(stud.name) &&
				 this.rollNo== stud.rollNo);
	}

	@Override
	public int compareTo(Student obj) {
		return this.rollNo - obj.rollNo;
		
	}
}
