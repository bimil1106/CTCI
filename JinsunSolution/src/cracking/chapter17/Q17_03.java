package cracking.chapter17;

/* 
 * Write an algorithm which computes the number of trailing zeros in n factorial
 */

public class Q17_03 {

	public static int factorial(int n) {
		if (n == 1 || n <= 0) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	public static int numTrailingZeros(int n) {
		int factorial = factorial(n);
		
		int zeros = 0;
		final int TEN = 10;
		
		while(factorial % 10 == 0) {
			zeros++;
			factorial /= TEN;
		}
		
		return zeros;
	}

	/*
	 * 15! = 15*14*13*12*11*10*9*8*7*6*5*4*3*2*1
	 * number of multiples of 5 == number of trailing zeros of factorial n 
	 */
	public static int numTrailingZeros2(int n) {
		if (n < 0) {
			return -1;
		}
		
		int zeros = 0;
		final int FIVE = 5;
		
		for (int i = n; i > 1; i--) {
			if (i % FIVE == 0) {
				zeros++;
			}
		}
		
		return zeros;
	}
	
	public static int countFactZeros(int num) {
		int count = 0;
		if (num < 0) {
			return -1;
		}
		
		for (int i = 5; num / i > 0; i *= 5) {
			count += num / i;
		}
		
		return count;
	}
}
