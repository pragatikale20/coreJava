package com.collections.lists;

import java.util.LinkedList;
import java.util.List;

public class Donations {

	public static void main(String[] args) {
		List<Donations> donarData = new LinkedList<>();
		
		donarData.add(new Donations("divyaa   ", 1000));
		donarData.add(new Donations("Sanika   ", 100));
		donarData.add(new Donations("Sakshii  ", 200));  
		donarData.add(new Donations("Nmarata  ", 500));
		donarData.add(new Donations("Snehaa   ", 9000));
		
		donarData.stream().forEach(System.out::println);
		
		
		System.out.println("Remove : ");
		Donations data = donarData.remove(1);
		donarData.stream().forEach(System.out::println);
		
	}
	
	
	private String donarName ;
	private int donarAmt;
	public Donations (String donarName , int donarAmt) {
		this.donarAmt = donarAmt;
		this.donarName = donarName;
	}
	public String getDonarName() {
		return donarName;
	}
	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}
	public int getDonarAmt() {
		return donarAmt;
	}
	public void setDonarAmt(int donarAmt) {
		this.donarAmt = donarAmt;
	}
	public String toString() {
		return ("Donar Name : " + donarName + "  Donar Amount : " + donarAmt);
	}
	
}
