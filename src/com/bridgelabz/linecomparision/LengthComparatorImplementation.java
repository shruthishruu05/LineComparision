package com.bridgelabz.linecomparision;

public class LengthComparatorImplementation implements LengthComparatorIF
{
	LengthCalculatorIF lengthCalculator = new LengthCalculatorImplementation();

	public void equalsMethod(Line line1, Line line2) {
		Double lengthOfLine1 = lengthCalculator.calculateLength(line1);
		Double lengthOfLine2 = lengthCalculator.calculateLength(line2);
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Line 1 and Line 2 are Equal");
		}
		else {
			System.out.println("Line 1 and Line 2 are not equal");
		}
	}
	public void compareToMethod(Line line1, Line line2) {
		Double lengthOfLine1 = lengthCalculator.calculateLength(line1);
		Double lengthOfLine2 = lengthCalculator.calculateLength(line2);
		int compareValue = lengthOfLine1.compareTo(lengthOfLine2);
		if(compareValue < 0)
			System.out.println("Line 1 is smaller than Line 2");
		else if(compareValue == 0)
			System.out.println("Line 1 is equal to Line 2");
		else
			System.out.println("Line 1 is greater than Line 2");

	}
}
