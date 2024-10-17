package com.collections.hashsets;

import java.util.Objects;

public class Test {
    private int queNo;
	private String que;
	private int marks;

public Test(int queNo, String que, int marks) {
	this.queNo = queNo;
	this.que = que;
	this.marks = marks;
}

public int getQueNo() {
	return queNo;
}

public void setQueNo(int queNo) {
	this.queNo = queNo;
}

public String getQue() {
	return que;
}

public void setQue(String que) {
	this.que = que;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

@Override
public int hashCode() {
	 return Objects.hash(queNo,que,marks);
}

@Override
public boolean equals(Object o) {
	if(o == null) 
		 return false;
	 if(this.getClass() != o.getClass())
		 return false;
	Test test1 = (Test)o;
	return(test1.marks == this.marks &&
			test1.queNo == this.queNo &&
			test1.que.equals(test1.que));
}

 public String toString() {
	 return("Question No: "+ queNo + " Question : "+ que + " Marks: "+ marks);
 }

}
