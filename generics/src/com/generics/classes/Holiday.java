package com.generics.classes;

import java.util.ArrayList;
import java.util.List;

public class Holiday {

	private List<KeyValuePair<String,String>> holiday = new ArrayList();
	
	public void add(KeyValuePair<String , String> occassion) {
		holiday.add(occassion);
		
	}
	public KeyValuePair<String, String> get(int index) {
		return holiday.get(index);
	}
	public int getSize() {
		return holiday.size();
		
	}
	
}
