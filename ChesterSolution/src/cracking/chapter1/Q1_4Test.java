package cracking.chapter1;

import org.junit.Test;

public class Q1_4Test {

	@Test
	public void testReplaceSpace() {
		String original="Let's go to mexico!      ";
		System.out.println(String.format("Original String='%s'", original));
		char[] input = original.toCharArray();
		char[] answer = Q1_4.replaceSpace(input, 19);
		System.out.println(String.format("answer='%s'", new String(answer)));
	}

}
