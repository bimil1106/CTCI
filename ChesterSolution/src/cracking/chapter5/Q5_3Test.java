package cracking.chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q5_3Test {
	static void printBin(String msg, int x) {
		System.out.println(msg + Integer.toBinaryString(x));
	}

	@Test
	public void testFindNext() {
		System.out.println("testFindNext() - ");
		int x = Integer.parseInt("101011100", 2);
		printBin("Input = ", x);
		int next = Q5_3.findNext(x);
		printBin("Next  = ", next);
		assertEquals(Integer.parseInt("101100011", 2), next);
	}

	@Test
	public void testFindPrev() {
		System.out.println("testFindPrev() - ");
		int x = Integer.parseInt("101000001", 2);
		printBin("Input = ", x);
		int prev = Q5_3.findPrev(x);
		printBin("Prev  = ", prev);
		assertEquals(Integer.parseInt("100110000", 2), prev);
	}
}
