package tester;

import java.util.Scanner;

import com.sunbeam.errors.ExceptionLineTooLong;

public class GetString {
	String s;
	
	public void setString(Scanner sc) throws ExceptionLineTooLong {
		System.out.println("Enter the string: ");
		s = sc.nextLine();
		
		if(s.length()>10) {
			throw new ExceptionLineTooLong("The string is too long..");
		}
		System.out.println("String length: "+s.length());
	}
	
	public void getString() {
		
		System.out.println("Your string: "+s);
	}

}
