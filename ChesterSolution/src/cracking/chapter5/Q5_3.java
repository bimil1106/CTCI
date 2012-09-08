package cracking.chapter5;

/*
 * Given a positive integer, print the next smallest and the next largest number
 * that have the same number of 1 bits in their binary representation.
 */
public class Q5_3 {
	static int findNext(int x) {
		int a = x;
		int zeroMostPosition = 0;
		while ((a & 1) == 0) {
			a >>= 1;
			zeroMostPosition++; 
		}
		int oneMostPosition = zeroMostPosition;
		while ((a & 1) == 1) {
			a >>= 1;
			oneMostPosition++;
		}
		int flipped = 1 << oneMostPosition;
		int mask = flipped - 1;
		return (x & ~mask) | flipped | ((x & mask) >> (zeroMostPosition + 1));
	}
	
	static int findPrev(int x) {
		int a = x;
		int oneMostPosition = -1;
		while ((a & 1) == 1) {
			a >>= 1;
			oneMostPosition++;
		}
		int zeroMostPosition = oneMostPosition;
		while ((a & 1) == 0) {
			a >>= 1;
			zeroMostPosition++; 
		}
		int flipped = 1 << zeroMostPosition;
		int mask = flipped - 1;
		int highMask = (~mask) << 2;
		return (x & highMask) | flipped | ((x & mask) << (zeroMostPosition - oneMostPosition - 1)); 
	}
}
