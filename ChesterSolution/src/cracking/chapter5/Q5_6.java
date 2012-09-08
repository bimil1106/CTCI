package cracking.chapter5;

/*
 * Write a program to swap odd and even bits in an integer with as few instructions 
 * as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and
 * so on).
 */
public class Q5_6 {
	static int swapOddEven(int x) {
		int mask = Integer.parseInt("101010101010101010101010101010", 2);
		return ((x & mask) >> 1) | ((x & (mask >> 1)) << 1);
	}
}
