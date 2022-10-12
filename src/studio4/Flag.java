package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(66, 245, 149); //greeeeeen
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2); //the background
		
		
		StdDraw.setPenColor(245, 84, 66); 
		StdDraw.setPenColor(0, 0, 0); //0
		double xLeft[] = {0.5, 0.1, 0.1};
		double yLeft[] = {0.5, 0.3, 0.7};
		StdDraw.filledPolygon(xLeft, yLeft);
		double xRight[] = {0.5, 0.9, 0.9};
		double yRight[] = {0.5, 0.3, 0.7};
		StdDraw.filledPolygon(xRight, yRight);
		StdDraw.setPenColor(245, 84, 66); //orangish red
		StdDraw.filledCircle(0.5, 0.4, 0.075);
		StdDraw.filledCircle(0.5, 0.6, 0.075);
		
		
	}
}