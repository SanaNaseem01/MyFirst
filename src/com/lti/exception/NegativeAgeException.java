package com.lti.exception;

//creating exception type
public class NegativeAgeException extends RuntimeException {

	public NegativeAgeException(String message) {
		super(message);

	}

	public NegativeAgeException() {
		super();
	}

	public NegativeAgeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public NegativeAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeAgeException(Throwable cause) {
		super(cause);
	}
	

}
