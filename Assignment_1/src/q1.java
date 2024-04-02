//Q1. Accept a integer number and when the program is executed print the binary, octal and 
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString()

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		System.out.println("Given Number: "+num);
		String bin = Integer.toBinaryString(num);
		String hexa = Integer.toHexString(num);
		String oct = Integer.toOctalString(num);
		System.out.println("Binary equivalent: "+bin);
		System.out.println("Octal equivalent: "+oct);
		System.out.println("Hexa equivalent: "+hexa);
		
		
		
	}

}
