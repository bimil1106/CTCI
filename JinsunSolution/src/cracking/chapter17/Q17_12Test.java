package cracking.chapter17;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q17_12Test {

	@Test
	public void testFindAllPairsSum() {
		int[] data = { 2,5,3,6,7,4,12,5,3,7,3,4,5,3,9,0,7,4,3,2,1,3,6,7,3,7 };
		Q17_12.findAllPairsSum(data, 10);
		
	}

}
