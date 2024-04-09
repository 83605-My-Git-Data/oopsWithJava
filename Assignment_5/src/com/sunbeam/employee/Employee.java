package com.sunbeam.employee;

import java.util.Scanner;


interface acceptData{
	void accept(Scanner sc);
	
}

public abstract class Employee implements acceptData {
	
	private String firstName;
	private String LastName;
	private int SSN;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	
	
    public abstract void calculateS();

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter firstName: ");
		firstName = sc.next();
		System.out.println("Enter LastName: ");
		LastName = sc.next();
		System.out.println("Enter Soical Security Number: ");
		SSN = sc.nextInt();
		
		
	}
	
	@Override
	public String toString() {
		
		return "FirstName: "+firstName+" LastName: "+LastName+" SSN: "+SSN;
	}
	
	
	
	
	
	
	

}

