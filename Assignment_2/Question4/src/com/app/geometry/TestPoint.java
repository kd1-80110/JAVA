package com.app.geometry;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		double x,y;
		String s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Coordinates for X-Axis ");
		x=sc.nextDouble();
		System.out.println("Enter Coordinates for Y-Axis ");
		y=sc.nextDouble();
		
		Point2D p1=new Point2D(x,y);
		System.out.println("Enter Coordinates for X-Axis ");
		x=sc.nextDouble();
		System.out.println("Enter Coordinates for Y-Axis ");
		y=sc.nextDouble();
		
		Point2D p2=new Point2D(x,y);
		s=p1.getDetails();
		System.out.println(s);
		
		if(p1.isEqual(p2)) {
			System.out.println("The two points are equal");
		}
		else {
			System.out.println("The two points are not equal");
		}
		double distance=p1.calculateDistance(p2);
		System.out.println("Distance between point 1 and point 2 = " + distance);
		
	}

}
