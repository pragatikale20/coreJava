package com.generics.classes;

public class Box <T> {
	

	public T content;
	public Box(T content) {
		this.content = content;
	}
	public T getContent() {
		return content;
	}
	
	
}
