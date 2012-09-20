package cracking.chapter5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q5_8Test {

	@Test
	public void testDrawHorizontalLine() {
		byte[] expectedScreen = new byte[32];
		expectedScreen[10] |= 0xFF;
		expectedScreen[11] |= 0xFF;
		expectedScreen[12] |= 0xFF;
		
		byte[] screen = new byte[32];
		int width = 8;
		int x1 = 2;
		int x2 = 4;
		int y = 1;
		
		Q5_8.drawHorizontalLine(screen, width, x1, x2, y);
		for(byte b: expectedScreen){
			System.out.print( b + " ");
		}
		
		System.out.println();
		for(byte b: screen){
			System.out.print(b + " ");
		}
		
		for(int i=0; i < screen.length; i++){
			if(expectedScreen[i] != screen[i]){
				System.out.println("two screen are not the same values. Fail.");
			}			
		}
		
		// See the solution of book, weird..
		
	}

}
