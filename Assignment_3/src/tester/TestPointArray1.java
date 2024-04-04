package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

//Q1.  Copy the  Point2D class , along with the package from previous assignment. 
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably 
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2)  Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit

public class TestPointArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points you want to add: ");
		int n = sc.nextInt();
		
		Point2D[] pts = new Point2D[n];
		
		System.out.println("Enter the details for points");
		
		for(int i = 0 ;i<n;i++) {
			pts[i] = new Point2D();
			pts[i].enterDetails();
		}
		
		
		
		int choice;
		
		do {
			System.out.println("Press 0 : To exit");
			System.out.println("Press 1 : To display specific point");
			System.out.println("Press 2 : To display All points");
			System.out.println("Press 3 : To calculate distance between points");
			
			
			
			 choice= sc.nextInt();
			
			switch (choice) {
			case 0:
			{
				System.out.println("Game overr....");
			}
				
				break;
				
			case 1:
			{
				
				System.out.println("Enter index for which you want to display point");
				int index = sc.nextInt();
				
				if(index <0 || index> n) {
					System.out.println("Invalid index");
					
				}
				Point2D.getDetails(pts[index]);
				
			}
				
				break;
				
			case 2:
			{
				System.out.println("All points entered are: ");
				
				for (Point2D point2d : pts) {
					point2d.getDetails(point2d);
					
				}
//				
//				for(int i = 0 ;i<n;i++) {
//					Point2D.getDetails(pts[i]);
//					
//				}
				break;
			}
			
			case 3:{
				System.out.println("Enter the two indices");
				int index = sc.nextInt();
				int index1 = sc.nextInt();
				
				
				if(index <0 || index > n) {
					System.out.println("Invalid index");
					
				}
				if(index1 <0 || index1 > n) {
					System.out.println("Invalid index");
					
				}
				
				
				if(pts[index].isEqual(pts[index1])){
					System.out.println("Points are equal, cannot compute distance");
					
					
				}
				else {
					double ans = pts[index].calculateDistance(pts[index1]);
					System.out.println("Distance between two points: "+ans);
				}
			}
			
				

			default:
				break;
			}
		}while(choice != 0);
		
		
	}

}
