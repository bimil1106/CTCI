package cracking.chapter7;

import java.util.HashMap;

/* 
 * Given a two-dimensional graph with points on it,
 * find a line which passes the most number of points.
 * 
 * */

/*
 * It can be interpreted as "the most number of lines in the list of Line
 * representing Line as a pair of slope and y intercept
 * 
 */

public class Q7_6{
	public static class Point{
		double x, y;
		public Point(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static class Line{
		double epsilon = 0.0000001;
		double slope;
		double yIntercept;
		
		public Line(Point p1, Point p2){
			slope = getSlope(p1, p2);
			yIntercept = getYIntercept(slope, p1);
		}
		
		public double getSlope(Point p1, Point p2){
			return (p2.y - p1.y) / (p2.x - p1.x);
		}
		
		public double getYIntercept(Double slope, Point p){
			return slope*p.x - p.y;
		}
		
		@Override
		public int hashCode(){			
			int PRIME = 31;
			int hashCode = 1;
			hashCode = (int)(hashCode * PRIME + slope);
			hashCode = (int)(hashCode * PRIME + yIntercept);
			
			return hashCode;
		}
		
		@Override
		public boolean equals(Object line){
			Line l = (Line)line;
			if(l instanceof Line){				
				if( Math.abs(slope - l.slope) < epsilon &&
						Math.abs(yIntercept - l.yIntercept) < epsilon ){
					return true;
				}
			}
			return false;
		}
		
		@Override
		public String toString(){
			StringBuilder lineInfo = new StringBuilder();
			lineInfo.append("Line slope: ")
				.append(slope)
				.append("Line y intercept: ")
				.append(yIntercept)
				.append("\n");
			
			return lineInfo.toString();
		}
	}
	
	public static Line lineWithMostNumberOfPoints(Point[] points){
		
		Line expectedLine = null;
		
		HashMap<Line, Integer> lines = new HashMap<Line, Integer>();
		
		for(int i = 0; i < points.length; i++){
			for(int j = i + 1; j < points.length; j++){
				Line line = new Line(points[i], points[j]);
				if(!lines.containsKey(line)){
					lines.put(line, 0);
				}
				else{
					lines.put(line, lines.get(line) + 1);
				}
				
				// key point: keep compare inside for loop
				// we can keep the most number of points in here
				System.out.println("current line: # of points " + lines.get(line) + " expected line: # of points" + lines.get(expectedLine));
				if(expectedLine == null || 
						lines.get(line) > lines.get(expectedLine)){
					expectedLine = line;
				}
			}
		}
		
		return expectedLine;
	}
}
