package google.top150.transposeinplace;

import org.junit.Test;

public class TransposeInPlaceTest {

	@Test
	public void test3x4() {
		testTranspose(3, 4);
	}
	
	@Test
	public void test5x6() {
		testTranspose(5, 6);
	}
	
	@Test
	public void test3x8() {
		testTranspose(3, 8);
	}
	
	@Test
	public void test7x8() {
		testTranspose(7, 8);
	}
	
	private void testTranspose(int width, int height) {
		int[] input = buildTable(width, height);
		System.out.println(String.format("Input table %dx%d >>>>>>>>", width, height));
		printTable(height, width, input);
		int[] result = TransposeInPlace.transpose(input, width, height);
		System.out.println(String.format("Output table %dx%d >>>>>>>>", height, width));
		printTable(width, height, result);

	}

	private void printTable(int width, int height, int[] result) {
		int inx = 0;
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				System.out.print(" " + result[inx++]);
			}
			System.out.println();
		}
	}
	
	private int[] buildTable(int width, int height) {
		int[] table = new int[width*height];
		for (int j=0; j<height; j++) {
			for (int i=0; i<width; i++) {
				table[j*width+i]=j*100+i;
			}
		}
		return table;
	}

}
