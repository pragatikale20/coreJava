package com.pollymorphism.test;
import com.pollymorphism.Parent;
import com.pollymorphism.Child;
import com.pollymorphism.Child1;

public class MainChildParent {
	public static void main(String[] args) {	
	
 Parent obj = new Parent();
 Child obj1 = new Child();
 
obj.wakeUp();
obj1.sleeps();
obj1.wakeUp();
 
 Parent parent1 = new Child();
 parent1.wakeUp();
 
 Parent child1 = new Child1();
 child1.wakeUp();
 
// obj.wakeUp();
// obj1.sleeps();
// obj1.wakeUp();
 }
 
}
