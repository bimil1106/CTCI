package cracking.chapter2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q2_7Test {
	static MyLinkedList ll=new MyLinkedList(20);
	static { ll.add(2).add(50).add(3).add(50).add(2).add(20); }

	static MyLinkedList ll2=new MyLinkedList(20);
	static { ll2.add(2).add(50).add(3).add(4).add(50).add(2).add(20); }

	@Test
	public void testIsPalindrome() {
		boolean result = Q2_7.isPalindrome(ll);
		assertTrue(result);
	}

	@Test
	public void testIsPalindrome2() {
		boolean result = Q2_7.isPalindrome(ll2);
		assertFalse(result);
	}
}
