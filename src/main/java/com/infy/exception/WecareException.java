package com.infy.exception;

public class WecareException extends Exception{

	private static final long serialVersionUID = 1L;
	
	    public WecareException(String message) {
	        super(message);
	    }


	    
	    // Add a method to throw exceptions with custom messages
	     public static void throwCustomException(String customMessage) throws WecareException {
	        throw new WecareException(customMessage);
	    }
}
