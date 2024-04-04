package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	public Point2D() {
		
	}
	
	
	public void enterDetails() {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X co-ordinate: ");
		x = sc.nextInt();
		setX(x);
		
		System.out.println("Enter Y co-ordinate: ");
		y = sc.nextInt();
		setY(y);
		
		
		
	}
	
	public Point2D(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public static void getDetails(Point2D p) {
		String string="";
		
		string = string+"Point("+p.getX()+","+p.getY()+")";
		
		
		System.out.println("Point: "+string);
		
	}
	
//	public static void getDetails(int i) {
//		System.out.println("Point: "+ );
//	}
	
	public boolean isEqual(Point2D p2) {
		if(this.getX() == p2.getX() && this.getY() == p2.getY()) {
			return true;
		}
		return false;
		
	}
	
	public double calculateDistance(Point2D p2) {
		
		int val1 = (p2.getX()-this.getX());
		int val2 = (p2.getY()-this.getY());
		
		double sqrVal1 = Math.pow(val1, 2);
		double sqrVal2 = Math.pow(val2, 2);
		
		double ans;
		
		return ans = Math.sqrt(sqrVal1+sqrVal2);
		
		
	}
	
	

}
