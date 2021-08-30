package com.bridgelabz.linecomparision;

import java.util.Scanner;
public class LineComparisionMain {
	public static void main(String[] args) {
		
		 Line line1 = new Line();
		 Line line2 = new Line();
	     System.out.println("Enter the coordinates of the line comparision");
		 Scanner in = new Scanner(System.in);
		 int x1Line1 = in.nextInt();
		 int y1Line1 = in.nextInt();
		 int x2Line1 = in.nextInt();
		 int y2Line1 = in.nextInt();
		 int x1Line2 = in.nextInt();
		 int y1Line2 = in.nextInt();
		 int x2Line2 = in.nextInt();
		 int y2Line2 = in.nextInt();
		 
		 LengthComparatorIF lengthComparator = new LengthComparatorImplementation();
		 line1.setStartCoordinate(x1Line1,y1Line1);
		 line1.setEndCoordinate(x2Line1,y2Line1);
		 line2.setStartCoordinate(x1Line2,y1Line2);
		 line2.setEndCoordinate(x2Line2,y2Line2);
		 lengthComparator.equalsMethod(line1, line2);
		 lengthComparator.compareToMethod(line1, line2);
		 
		 LengthCalculatorIF lengthCalculator = new LengthCalculatorImplementation();
		 System.out.println(lengthCalculator.calculateLength(line1));
		 System.out.println(lengthCalculator.calculateLength(line2));
	     in.close();
			 
	}
}
