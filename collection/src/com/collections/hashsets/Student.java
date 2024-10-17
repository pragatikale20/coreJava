package com.collections.hashsets;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private String firstName;
	private String midName;
	private String lastName;
	private int fees;
	private String course;
	
	
	
	public Student(String firstName, String midName, String lastName, int fees, String course) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.fees = fees;
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}

    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(firstName,midName,lastName,fees,course);
//	}
//	
//	public boolean eqauls(Object obj) {
//		if(obj == null) {
//			return false;
//		}
//		if(this.getClass() != obj.getClass()) {
//			return false;
//		}
//		Student stud = (Student) obj;
//		return (this.firstName.equals(stud.firstName)
//				&& this.midName.equals(stud.midName)
//				&&this.lastName.equals(stud.lastName)
//				&& this.fees == stud.fees
//				&& this.course.equals(stud.course)
//				);
//	}
//	
	@Override
	public int compareTo(Student obj) {
		return this.course.compareTo(obj.course);
		
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName + ", fees=" + fees
				+ ", course=" + course + "]";
	}
	
	
	
	
	
	
	
}
