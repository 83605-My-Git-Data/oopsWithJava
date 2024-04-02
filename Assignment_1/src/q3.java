//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices) 
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd 
//food)

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bill =0;
		int choice;
		
		
		do {
			
			System.out.println("Our Menu: ");
			System.out.println("0. To exit");
			System.out.println("1.Dosa 10rs");
			System.out.println("2.Samosa 20rs");
			System.out.println("3.Indli 30rs");
			System.out.println("4.Bhel 40rs");
			System.out.println("5.pavbhaji 50rs");
			System.out.println("6.Total Bill");
			System.out.println("Enter the option: ");
			
			choice = scanner.nextInt();
			
			
			
			switch (choice) {
			case 1:
				bill = bill+10;
				
				break;
			case 2:
				bill = bill+20;
				break;
			case 3:
				bill = bill+30;
				break;
			case 4:
				bill = bill+40;
				break;
			case 5:
				bill = bill+50;
				break;
			case 6:
				System.out.println("Total bill is: "+bill);
				
				break;
				
				

			default:
				System.out.println("Exited");
				break;
			}
			
		}while(choice!=0);

	}

}
