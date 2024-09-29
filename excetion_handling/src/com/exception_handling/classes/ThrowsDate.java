package com.exception_handling.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDate {

	public Date getDate(String date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy.mm.dd");
		return dateFormat.parse(date) ;
		
	}
}
