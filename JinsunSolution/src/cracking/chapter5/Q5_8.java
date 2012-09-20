package cracking.chapter5;

/* 
 * A monochrome screen is stored as a single array of bytes, allowing eight consecutive pixels 
 * to be stored in one byte. The screen has width w, where w is divisible by 8
 * (that is, no byte will be split across rows). The height of the screen,
 * of cause, can be derived from the length of the array and the width. 
 * Implement a function drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y)
 * which draws a horizontal line from (x1, y) to (x2, y).
 * 
 * */

public class Q5_8 {

	public static void drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y){
		
		if(screen.length <= 0 || screen.length % 8 != 0){
			System.out.println("The size of screen array should be multiples of eight");
			return;
		}
		
		if(width %8 != 0){
			System.out.println("The size of width should be multiples of eight");
			return;
		}
		
		if(x1 < 0 || x1 >= width){
			System.out.println("x1 value should greater than or equal to zero and less than width.");
			return;
		}
		
		if(x2 < 0 || x2 >= width){
			System.out.println("x2 value should greater than or equal to zero and less than width.");
			return;
		}
		
		if(x1 > x2){
			System.out.println("x1 should less than or eaual to x2");
		}
		
		int height = screen.length / width;
		if(y >= height){
			System.out.println("y should be less than height:" + height);
		}
		
		int x1_rowY = x1 + y * width;
		int x2_rowY = x2 + y * width;
		
		for(int i = x1_rowY; i <= x2_rowY; i++){
			screen[i] = (byte) 0xFF;
		}
		
	}
}
