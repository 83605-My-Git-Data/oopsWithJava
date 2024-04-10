package tester;

import java.util.Scanner;

import com.sunbeam.errors.ExceptionLineTooLong;

//Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The 
//strings is too long". Write a program that reads a String from user and calculates its length.  and 
//throws an exception of type ExceptionLineTooLong in the case where a string of length is more 
//than 80 characters.
//(Hint- Use String class length() method)

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GetString get = new GetString();
		
		
		try 
		{
			get.setString(sc);
			
			get.getString();
			
		}
		catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		
	}

}
