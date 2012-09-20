package cracking.chapter7;

/* 
 * Given two lines on a Cartesian plane, determine whether the two lines
 * would intersect.
 * 
 * */
public class Q7_3 {
	
	public class Line{
		double x1, y1, x2, y2;
		double epsilon = 0.0000001;
		
		public Line(double x1, double y1, double x2, double y2){
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		public boolean intersect(Line l2){
			return Math.abs((y2-y1)/(x2-x1) - (l2.y2-l2.y1)/(l2.x2-l2.x1)) > epsilon; 
		}
	}
}
