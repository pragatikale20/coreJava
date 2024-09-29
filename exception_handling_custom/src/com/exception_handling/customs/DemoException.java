package com.exception_handling.customs;

public class DemoException extends RuntimeException {

	
	public DemoException() {
		super();
	}
	public DemoException(String message , Throwable cause, boolean enableSuppression) {
		super(message , cause, enableSuppression, enableSuppression);
	}
	public DemoException(String message , Throwable cause) {
		super(message, cause);
	}
}
