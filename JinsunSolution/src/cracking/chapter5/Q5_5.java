package cracking.chapter5;

/* 
 * Write a function to determine the number of bits required
 * to convert integer A to integer B.
 * EXAMPLE
 * Input: 31, 14
 * Output: 2
 * 
 * */

public class Q5_5 {

	public static int getNumberOfBitsToConvert(int x, int y){
		int numberOfBits = 0;
		
		int xorXY = x ^ y;
		
		do{
			if((xorXY & 1) == 1){
				numberOfBits++;
			}
			xorXY = xorXY >> 1;
			//xorXY = xorXY & (xorXY-1);
		}
		while(xorXY != 0);
		
		return numberOfBits;
	}
}
