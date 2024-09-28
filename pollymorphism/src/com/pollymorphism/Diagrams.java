package com.pollymorphism;

public class Diagrams {

	private int radius;
	private int height;
	private int width;
	
	public Diagrams(int radius) {
		this.radius = radius;
	}
	public Diagrams(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public void area(int radius , int height , int width) {
		System.out.println("The radius is : " + radius);
		System.out.println("The height is: " + height);
		System.out.println("The width is : "+  width);
		System.out.println("The area of circle is: " + (2 * 3.14 * radius));
		System.out.println("The area of rectangle is : " + (height * width));
	}
}
