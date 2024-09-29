package com.exception_handling.classes;

import java.text.ParseException;

public class MainThrows {
public static void main(String[] args) {
	ThrowsDate obj = new ThrowsDate();
	try {
		System.out.println(obj.getDate("2024.01.01"));
	} catch (ParseException ex) {
		System.out.println("Invalid Date Format");
		ex.printStackTrace();
	}
}
}
