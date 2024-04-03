package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		Scanner sc = new Scanner(System.in);
		
		int p1x;
		int p1y;
		int p2x;
		int p2y;
		
		
		System.out.println("Enter X cordinate of p1 point: ");
		p1x = sc.nextInt();
		p1.setX(p1x);
		
		System.out.println("Enter Y cordinate of p1 point: ");
		p1y = sc.nextInt();
		p1.setY(p1y);
		
		
		System.out.println("Enter X cordinate of p2 point: ");
		p2x = sc.nextInt();
		p2.setX(p2x);
		
		System.out.println("Enter Y cordinate of p2 point: ");
		p2y = sc.nextInt();
		p2.setY(p2y);
		
		
		boolean isEq  = p1.isEqual(p2);
		
		if(isEq) {
			System.out.print("P1: ");
			String dis1 = p1.getDetails();
			System.out.println(dis1);
			
			System.out.print("P2: ");
			String dis2 = p2.getDetails();
			
			System.out.println(dis2);
			
			System.out.println("Points are same");
			
		}
		else {
			System.out.print("P1: ");
			String dis1 = p1.getDetails();
			System.out.println(dis1);
			
			System.out.print("P2: ");
			String dis2 = p2.getDetails();
			
			System.out.println(dis2);
			
			double ans = p1.calculateDistance(p2);
			
			System.out.println("Distance between two points: "+ans);
		}
		
		
		
	}

}
