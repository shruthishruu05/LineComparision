package com.bridgelabz.linecomparision;

import java.util.*;
import java.lang.Math;
public class LineComparision {
	
	public static double getLength(int x1,int x2,int y1, int y2)
	{
		double result;
		double val = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
				//System.out.println(val);
		result = Math.sqrt(val);
		return result;
	}
	
	
	public static void main(String [] args) 
	{
		int x1 = (int)(Math.random()*100);
		int x2 = (int)(Math.random()*100);
		int y1 = (int)(Math.random()*100);
		int y2 = (int)(Math.random()*100);
		int x11 = (int)(Math.random()*100);
		int x12 = (int)(Math.random()*100);
		int y11 = (int)(Math.random()*100);
		int y12 = (int)(Math.random()*100);
		
		Double l1 = getLength(x1,x2,y1,y2);
		Double l2 = getLength(x11,x12,y11,y12);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("Welcome to line comparision computation program");
                int val=l1.compareTo(l2);
		if(val ==0)
			System.out.println("both values are equal");
		else if(val>0)
			System.out.println("The 1st line is greater than the 2nd line");
		else 
			System.out.println("The 1st line is lesser than the 2nd line");
	}
	

}
