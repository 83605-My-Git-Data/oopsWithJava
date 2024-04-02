//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not 
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		double val1;
		double val2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter num 1: ");
		
		if(scanner.hasNextDouble()) {
			val1 = scanner.nextDouble();
			
			System.out.println("Enter num 2: ");
			
			if(scanner.hasNextDouble()) {
				val2 = scanner.nextDouble();
				double avg;
				avg = (val1+val2)/2;
				System.out.println("Your avg is: "+avg);
			}
			else {
				System.out.println("2nd number not double");
			}
		}
		else {
			System.out.println("1 st num not double");
		}
		
	}
}
