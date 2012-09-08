package cracking.chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q5_6Test {

	@Test
	public void testSwapOddEven() {
		int x = Integer.parseInt("110101101", 2);
		int expected = Integer.parseInt("1001011110", 2);
		assertEquals(expected, Q5_6.swapOddEven(x));
	}

}
