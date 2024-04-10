package com.sunbeam.errors;


//Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The 
//strings is too long". Write a program that reads a String from user and calculates its length.  and 
//throws an exception of type ExceptionLineTooLong in the case where a string of length is more 
//than 80 characters.
//(Hint- Use String class length() method)


public class ExceptionLineTooLong extends Exception {
	String field;
	String message;
	
	

	public ExceptionLineTooLong() {
		
		this.field = "";
		this.message = "";
		
		
	}

	public ExceptionLineTooLong(String message) {
		
		
		this.message = message;
	}

	
	@Override
	public void printStackTrace() {
		System.out.println("Exception: ");
		System.out.println("ExceptionLineTooLong: "+message);
		
	}
	
	
	
	

}
