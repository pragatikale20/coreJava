package com.generics.classes;


public class MainKeyValuePair {
	public static void main(String[] args) {
//		KeyValuePair<String, String> dict1 = new KeyValuePair<>("Sakshi" , "Little Dumb");
//		KeyValuePair<String, String> dict2 = new KeyValuePair<>("Divii","Chimanii");
//		KeyValuePair<String, String> dict3 = new KeyValuePair<>("Nmarata", "MandBadakk..!!");
//		KeyValuePair<String, String> dict4 = new KeyValuePair<>("Me", "Pragati Kale");
//		System.out.println(dict1);
//		System.out.println(dict2);
//		System.out.println(dict3);
//		System.out.println(dict4);
		
		Dictinary dict = new Dictinary();
		dict.add(new KeyValuePair<>("Sakshi" , "Little Dumb"));
		dict.add( new KeyValuePair<>("Divii","Chimanii"));
		dict.add( new KeyValuePair<>("Divii","Chimanii"));
		dict.add(new KeyValuePair<>("Me", "Pragati Kale"));
        for(int i = 0 ; i<dict.getSize(); i++) {
			
			System.out.println(dict.get(i));
		}
		
		
       
//		KeyValuePair<Long, String> phoneNum1 = new KeyValuePair<>(1234567890L, "Divyaa");
//		KeyValuePair<Long, String> phoneNum2 = new KeyValuePair<>(1234567890L, "Sakshi");
//		KeyValuePair<Long, String> phoneNum3 = new KeyValuePair<>(1234567890L, "Namrata");
//		KeyValuePair<Long, String> phoneNum4 = new KeyValuePair<>(1234567890L, "Pragati");
//		
//		System.out.println(phoneNum1);
//		System.out.println(phoneNum2);
//		System.out.println(phoneNum3);
//		System.out.println(phoneNum4);
//		
		PhoneBook phoneBook = new PhoneBook();
		
		System.out.println("\tThe phonebook records : ");
		phoneBook.add( new KeyValuePair<>(1234567890L, "Diviii"));
		phoneBook.add( new KeyValuePair<>(1234567890L, "Saksha"));
		phoneBook.add(new KeyValuePair<>(1234567890L, "Namrataaa"));
		phoneBook.add( new KeyValuePair<>(1234567890L, "Pragatiiiii"));
		
		for(int i =0 ; i<phoneBook.getSize(); i++) {
			
			System.out.println(phoneBook.get(i));
		}
		//System.out.println("The phonebook record : " + phoneBook.get(0));
		
		
	
	
	Holiday holiday = new Holiday();
	holiday.add(new KeyValuePair<>("26 Jan 2024","Republic Day"));
	holiday.add(new KeyValuePair<>("15 Aug 2024","Independance Day Day"));
	holiday.add(new KeyValuePair<>("02 Oct 2024","Gandhi jayanti"));
	holiday.add(new KeyValuePair<>("19 Feb 2024","Shivjayanti"));
	holiday.add(new KeyValuePair<>("08 Mar 2024","Women's Day"));
	System.out.println("\tThe Holidays are ");
	
	for(int i = 0 ; i<holiday.getSize(); i++) {
		System.out.println(holiday.get(i));
	}
	}
}











