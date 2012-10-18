package cracking.chapter9;

/*
 * Implement the "paint fill" function that one might see on many image editing
 * programs. That is, given a screen (represented by a two-dimensional array of
 * colors), a point, and a new color, fill in the surrounding area until the color
 * changes from the original color
 *  
 */
public class Q9_7 {

	public static enum Color {
		W,
		P,
		Y,
		B
	}

	public static void paintfill(Color[][] screen, int x, int y, Color newColor) {
		paintfill(screen, x, y, screen[y][x], newColor);
		// y: row, x: column
	}
	
	public static void paintfill(Color[][] screen, int x, int y, Color originalColor, Color newColor){
		System.out.println("x: " + x + " y: " + y);
		
		if (x < 0 || x >= screen[0].length) return; // column
		if (y < 0 || y >= screen.length) return; // row
		
		if(screen[y][x] == originalColor) {
			screen[y][x] = newColor;
			paintfill(screen, x-1, y, originalColor, newColor); // left
			paintfill(screen, x+1, y, originalColor, newColor); // right
			paintfill(screen, x, y-1, originalColor, newColor); // up
			paintfill(screen, x, y+1, originalColor, newColor); // down
		}
		
		for(int i = 0; i < screen.length; i++){
			for(int j =0; j < screen[0].length; j++){
				System.out.print(screen[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
