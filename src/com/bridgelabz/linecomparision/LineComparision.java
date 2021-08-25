package com.bridgelabz.linecomparision;

public class LineComparision {
	int x1,x2,y1,y2;
	Double LengthOfLine;
	LineComparision(int x1,int x2,int y1,int y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	public void isItEqual(LineComparision l2)
	{
		 if((this.LengthOfLine).equals(l2.LengthOfLine))
			System.out.println("the lines are equal!");
		else
			System.out.println("the lines are NOT equal!");

	}
	public static void main(String[] args) {
		System.out.println("Welcome to line comparision");
		int x1 = (int)(Math.random()*100);
		int x2 = (int)(Math.random()*100);
		int y1 = (int)(Math.random()*100);
		int y2 = (int)(Math.random()*100);
		int x11 = (int)(Math.random()*100);
		int x12 = (int)(Math.random()*100);
		int y11 = (int)(Math.random()*100);
		int y12 = (int)(Math.random()*100);
		
		LineComparision l1 = new LineComparision(x1,x2,y1,y2);
		LineComparision l2 = new LineComparision(x11,x12,y11,y12);
		System.out.println("The lengths of the lines are: ");
		l1.getLength();
		l2.getLength();
		l1.isItEqual(l2);
		l1.compareTo(l2);
		
		
	}
	public void getLength()
	{
		
		LengthOfLine = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("The Length of the line is "+LengthOfLine);
		
	}
	
	public void compareTo(LineComparision l2)
	{
		int result = (this.LengthOfLine).compareTo(l2.LengthOfLine);
		
		if(result== 0)
			System.out.println("Both the lines are equal!");
		else if(result>0)
			System.out.println("Line 1 is greater than Line 2!");
		else
			System.out.println("Line 2 is greater than Line 1!");
	}

}