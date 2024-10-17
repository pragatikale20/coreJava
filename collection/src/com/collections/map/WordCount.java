package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		String msg = "This is Indapur city "
				+ "Indapur  is  has pincode 413106";
		
//		String msgArray[]= msg.split("[ .,:]");
//		for(String temp:msgArray)
//		         System.out.println(temp);
		
		Map<String,Integer> wordCount = new LinkedHashMap<>();
		
		
		
		StringTokenizer tokens = new StringTokenizer(msg,"[ ,.:]");
		while(tokens.hasMoreElements()) {
			String temp = (String)tokens.nextElement();
			
			if(wordCount.putIfAbsent(temp,1)!=null)
				wordCount.compute(temp,(key, value) -> value+1 );
			}
		
		wordCount.forEach((k,v) -> System.out.println(k+" ->" + v));
		}
}
