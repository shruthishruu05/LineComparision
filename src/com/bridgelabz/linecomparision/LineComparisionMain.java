package com.bridgelabz.LineComparision2;

import java.util.Scanner;
public class LineComparisionMain {
	public static void main(String[] args) {
		
		 Line line1 = new Line();
		 Line line2 = new Line();
	     System.out.println("Enter the coordinates of the line comparision");
		 Scanner in = new Scanner(System.in);
		 int x1Coordinate = in.nextInt();
		 int y1Coordinate = in.nextInt();
		 int x2Coordinate = in.nextInt();
		 int y2Coordinate = in.nextInt();
		 int x11Coordinate = in.nextInt();
		 int y11Coordinate = in.nextInt();
		 int x22Coordinate = in.nextInt();
		 int y22Coordinate = in.nextInt();
		 
		 LengthComparatorIF lengthComparator = new LengthComparatorImplementation();
		 line1.setPoint1(x1Coordinate,y1Coordinate);
		 line1.setPoint2(x2Coordinate,y2Coordinate);
		 line2.setPoint1(x11Coordinate,y11Coordinate);
		 line2.setPoint2(x22Coordinate,y22Coordinate);
		 lengthComparator.equalsMethod(line1, line2);
		 lengthComparator.compareToMethod(line1, line2);
		 
		 LengthCalculatorIF lengthCalculator = new LengthCalculatorImplementation();
		 System.out.println(lengthCalculator.calculateLength(line1));
		 System.out.println(lengthCalculator.calculateLength(line2));
	     in.close();
			 
	}
}
