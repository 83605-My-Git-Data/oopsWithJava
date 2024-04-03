package com.app.geometry;

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
	
	public Point2D(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		String string="";
		
		string = string+"Point("+x+","+y+")";
		
		
		return string;
		
	}
	
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
