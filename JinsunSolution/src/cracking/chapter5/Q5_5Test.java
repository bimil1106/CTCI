package cracking.chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q5_5Test {

	@Test
	public void testGetNumberOfBitsToConvert() {
		assertEquals(Integer.valueOf(2), Integer.valueOf(Q5_5.getNumberOfBitsToConvert(31, 14)));
		assertEquals(Integer.valueOf(1), Integer.valueOf(Q5_5.getNumberOfBitsToConvert(5, 7)));
		assertEquals(Integer.valueOf(5), Integer.valueOf(Q5_5.getNumberOfBitsToConvert(15, 64)));
		assertEquals(Integer.valueOf(6), Integer.valueOf(Q5_5.getNumberOfBitsToConvert(31, 32)));
	}

}
