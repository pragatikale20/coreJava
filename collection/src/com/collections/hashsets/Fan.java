package com.collections.hashsets;

import java.util.Objects;

public class Fan {
 private int wings;
 private int price;
 private int speed;
 private String color;
 
 public Fan(int wings, int price,int speed,String color) {
	 this.wings = wings;
	 this.price = price;
	 this.speed = speed;
	 this.color = color;
 }

 
public int getWings() {
	return wings;
}
public void setWings(int wings) {
	this.wings = wings;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
 @Override
public int hashCode() {
//	int hash = 65;
//	hash += 17*wings;
//	hash += 17*price;
//	hash += 17*speed;
//	hash += 17*color.hashCode();
//	return hash;
	 return Objects.hash(wings,speed,price,color);
}
 
 @Override
public boolean equals(Object obj) {
	 if(obj == null) 
		 return false;
	 if(this.getClass() != obj.getClass())
		 return false;
	 Fan fan = (Fan)obj;
	 return(fan.wings == this.wings
			 && fan.speed == this.speed  
			 && fan.price == this.price
			 && fan.color.equals(this.color));
	 
 }
 
 
public String toString() {
	return (" Wings:  "+ wings + "  price :   "+ price + "  Speed:  "+speed + "  color:  "+color);
}
 
}
