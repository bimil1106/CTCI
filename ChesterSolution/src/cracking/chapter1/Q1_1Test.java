package cracking.chapter1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class Q1_1Test {
	@Test
	public void testIsUnique() {
		assertTrue("isUnique?", Q1_1.isUnique("abcdfeg"));
		assertFalse("isUnique?", Q1_1.isUnique("abcdfdeg"));
	}

}