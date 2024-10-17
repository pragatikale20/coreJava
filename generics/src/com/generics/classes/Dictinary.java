package com.generics.classes;
import java.util.ArrayList;
import java.util.List;

public class Dictinary {

	private List<KeyValuePair<String , String>> dictionary = new ArrayList<>();
	
	public void add( KeyValuePair<String , String> dictRecord) {
		dictionary.add(dictRecord);
		
	}
	 public KeyValuePair<String, String> get(int index) {
		 return dictionary.get(index);
	 }
	 public int getSize() {
		 return dictionary.size();
	 }
	 
}
