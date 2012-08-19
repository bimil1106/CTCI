package google.top150.transposeinplace;

import org.junit.Test;

public class TransposeInPlaceTest {

	@Test
	public void testTranspose() {
		int width = 7;
		int height = 4;
		int[] input = { 10, 20, 30, 40, 50, 60, 70,
						11, 21, 31, 41, 51, 61, 71,
						12, 22, 32, 42, 52, 62, 72,
						13, 23, 33, 43, 53, 63, 73};
		int[] result = TransposeInPlace.transpose(input, width, height);
		int inx = 0;
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				System.out.print(" " + result[inx++]);
			}
			System.out.println();
		}

	}

}