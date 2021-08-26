package com.bridgelabz.LineComparision2;
public class Line {

	Point point1 = new Point();
	Point point2 = new Point();

	public void setPoint1(int x1, int y1) {
		
		point1.setxCoordinate(x1);
		point2.setyCoordinate(y1);
	}
	public void setPoint2(int x2, int y2 ) {
		point1.setxCoordinate(x2);
		point2.setyCoordinate(y2);
	}
	public Point getPoint1() {
		return point1;
	}
	public Point getPoint2() {
		return point2;
	}
}
	
	
	
	
	

