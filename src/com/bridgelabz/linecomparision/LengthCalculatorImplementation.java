package com.bridgelabz.LineComparision2;

public class LengthCalculatorImplementation implements LengthCalculatorIF{
	@Override
	public double calculateLength(Line line1) {
		int x1 = line1.getPoint1().getxCoordinate();
		int y1 = line1.getPoint1().getyCoordinate();
		int x2 = line1.getPoint2().getxCoordinate();
		int y2 = line1.getPoint2().getyCoordinate();
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}

}
