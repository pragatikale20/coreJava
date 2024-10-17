package com.generics.upperbiunds;

public class GenericUpperBound <T extends Number> {

	private T val;

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
	
}
