package tester;

import java.util.Scanner;

import com.sunbeam.employee.BaseCommissioned;
import com.sunbeam.employee.CommissionedEmployee;
import com.sunbeam.employee.Employee;
import com.sunbeam.employee.HourlyEmployee;
import com.sunbeam.employee.SalariedEmployee;

public class Payroll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which type of employee you want to add: ");
		System.out.println("Press 1: Salaried");
		System.out.println("Press 2: Hourly");
		System.out.println("Press 3: Commissioned");
		System.out.println("Press 4: Base-commissioned");
		
		int choice;
		
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
		
		{
			
			Employee emp = new SalariedEmployee();
			emp.accept(sc);
			System.out.println(emp);
			emp.calculateS();
			
		}
		
			
			break;
		case 2:
			
		{
			Employee emp = new HourlyEmployee();
			emp.accept(sc);
			
			emp.calculateS();
		}
		
			
			break;
		case 3:
			
		{
			
			Employee emp = new CommissionedEmployee();
			emp.accept(sc);
			
			emp.calculateS();
			
		}
		
			
			break;
		case 4:
			
		{
			Employee emp = new BaseCommissioned();
			BaseCommissioned b = (BaseCommissioned) emp;
			
			b.accept(sc);
			System.out.println(b);
			b.calculateS();
			b.reward();
			
		}
		
			
			break;

		default:
			break;
		}
	}

}
