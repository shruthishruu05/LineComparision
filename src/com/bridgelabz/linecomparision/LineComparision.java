package com.bridgelabz.linecomparision;

import java.util.*;
import java.lang.Math;
public class LineComparision {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1=0,y1=0,x2=0,y2=0;
		x1 = (int) Math.floor(Math.random()*10);
		y1 = (int) Math.floor(Math.random()*10);
		x2 = (int) Math.floor(Math.random()*10);
		y2 = (int) Math.floor(Math.random()*10);
		double len =  Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("The Length of the line : "+ len);
		

	}

}