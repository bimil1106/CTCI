package cracking.chapter2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q2_2Test {
	static MyLinkedList ll=new MyLinkedList(20);
	static { ll.add(2).add(50).add(3).add(100).add(43).add(56).add(129); }
	
	@Test
	public void testKthLast() {
		int answer = Q2_2.kthLast(ll, 3);
		assertEquals(43, answer);
	}

}
