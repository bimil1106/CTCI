package cracking.chapter17;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Q17_09Test {

	@Test
	public void testFindFrequencyWord() {
		assertEquals(Integer.valueOf(3), Integer.valueOf(Q17_09.findFrequencyWord("this")));
		assertEquals(Integer.valueOf(3), Integer.valueOf(Q17_09.findFrequencyWord("very")));
		assertEquals(Integer.valueOf(2), Integer.valueOf(Q17_09.findFrequencyWord("book")));
	}

}
