package cracking.chapter17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Q17_03Test {

	@Test
	public void testNumTrailingZeros() {
//		assertEquals(Integer.valueOf(1), Integer.valueOf(Q17_03.numTrailingZeros(7)));
//		assertEquals(Integer.valueOf(2), Integer.valueOf(Q17_03.numTrailingZeros(10)));
//		assertEquals(Integer.valueOf(3), Integer.valueOf(Q17_03.numTrailingZeros(16)));

		assertEquals(Integer.valueOf(1), Integer.valueOf(Q17_03.numTrailingZeros2(7)));
		assertEquals(Integer.valueOf(4), Integer.valueOf(Q17_03.numTrailingZeros2(20)));
		assertEquals(Integer.valueOf(3), Integer.valueOf(Q17_03.numTrailingZeros2(16)));

	}

}
