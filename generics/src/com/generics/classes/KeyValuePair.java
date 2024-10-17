package com.generics.classes;

public class KeyValuePair <K, V>{

	private K key;
	private V value;
	
	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKeyValue(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public String toString() {
		return key + " -->" + value;
		
	}
}
