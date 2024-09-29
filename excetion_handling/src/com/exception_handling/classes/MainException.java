package com.exception_handling.classes;

public class MainException {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;

	}

	@Override
	public String toString() {
		return "message = " + message;
		
}
}
