package cracking.chapter17;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q17_06Test {

	@Test
	public void testFindUnsortedRange() {
		int[] data = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
		Q17_06.findUnsortedRange(data);
	}

}
