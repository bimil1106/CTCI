package cracking.chapter17;

/*
 * Given an array of integers, write a method to find indices m and n such that if you
 * sorted elements m through n, the entire array would be sorted. Minimize n - m
 * (that is, find the smallest such sequence).
 * 
 * EXAMPLE
 * Input: 1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19
 * Output: (3, 9)
 * 
 */
public class Q17_06 {

	public static void findUnsortedRange(int[] data) {
		int comparator = -1;
		int start = -1;
		int end = -1;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > data[i+1]) {
				comparator = data[i+1];
				for (int j = i-1; j > 0; j--) {
					if (data[j] <= comparator) {
						start = j;
						break;
					}
				}
				break;
			}
		}
		
		System.out.println("start: " + start);
		
		if (comparator == -1) {
			System.out.println("This array is sorted");
			return;
		}
		
		for (int i = data.length - 1; i >= 0; i--) {
			if (data[i-1] > data[i]) {
				comparator = data[i-1];
				for (int j = i+1; j < data.length; j++) {
					if (data[j] >= comparator) {
						end = j-1;
						break;
					}
				}
				break;
			}
			
		}

		System.out.println("end: " + end);
	}
}
