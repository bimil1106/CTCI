package cracking.chapter11;

/*
 * You are given two sorted arrays, A and B, where A has a large enough buffer at
 * the end to hold B. Write a method to merge B into A in sorted order.
 * 
 */

/*
 * target = 1,5,9
 * source = 2,6,7
 * 
 */
public class Q11_1 {

	public static void mergeArraysInOrders(int[] target, int targetRealSize, int[] source) {
		
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < targetRealSize; j++) {
				
				if (source[i] < target[j]) {
					int temp = source[i];
					source[i] = target[j];
					target[j] = temp;
				}
			}
			target[targetRealSize] = source[i];
			targetRealSize++;
		}
	}
}
