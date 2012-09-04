package google.top150.transposeinplace;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfSmallestCoinsTest {

	@Test
	public void testGetMinimumNumberOfCoinsToMake() {
		int answer = NumberOfSmallestCoins.getMinimumNumberOfCoinsToMake(10);
		assertEquals(2, answer);
	}

}
