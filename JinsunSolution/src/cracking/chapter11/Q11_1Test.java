package cracking.chapter11;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q11_1Test {

	@Test
	public void testMergeArraysInOrders() {
		int[] target = new int[10];
		target[0] = 1;
		target[1] = 5;
		target[2] = 9;
		
		int[] source = new int[]{2, 6, 7};
		
		Q11_1.mergeArraysInOrders(target, 3, source);
		for (int e: target) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
