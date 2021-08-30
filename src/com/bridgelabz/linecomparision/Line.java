package com.bridgelabz.linecomparision;
public class Line {

	Point point1 = new Point();
	Point point2 = new Point();

	public void setStartCoordinate(int x1, int y1) {
		
		point1.setxCoordinate(x1);
		point2.setyCoordinate(y1);
	}
	public void setEndCoordinate(int x2, int y2 ) {
		point1.setxCoordinate(x2);
		point2.setyCoordinate(y2);
	}
	public Point getStartCoordinate() {
		return point1;
	}
	public Point getEndCoordinate() {
		return point2;
	}
}
	
	
	
	
	

