package cracking.chapter6;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q6_1Test {

	@Test
	public void testFindHeavyBottle() {
		double[] bottles = new double[] {
				1.0, 1.0, 1.0, 1.0, 1.0, 
				1.0, 1.0, 1.1, 1.0, 1.0, 
				1.0, 1.0, 1.0, 1.0, 1.0, 
				1.0, 1.0, 1.0, 1.0, 1.0 
				};
		int answer = Q6_1.findHeavyBottle(bottles);
		assertEquals(8, answer);
	}

}
