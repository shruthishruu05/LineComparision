package com.bridgelabz.linecomparision;

public class LengthCalculatorImplementation implements LengthCalculatorIF{
	@Override
	public double calculateLength(Line line1) {
		int x1 = line1.getStartCoordinate().getxCoordinate();
		int y1 = line1.getStartCoordinate().getyCoordinate();
		int x2 = line1.getEndCoordinate().getxCoordinate();
		int y2 = line1.getEndCoordinate().getyCoordinate();
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}

}
