package google.top150.transposeinplace;

public class TransposeInPlace {
	/*
	 * input: a1, a2, ..., an, b1, b2, ..., bn, c1, c2, ..., cn
	 * output: a1, b1, c1, a2, b2, c2, ..., an, bn, cn
	 * the transpose should be done in place
	 */
	int[] transpose(int[] input) {
		int size = input.length;
		int columnSize = size / 3;
		int tmp, x, y, x2, y2, inx2;
		for (int inx=size; inx>=0; inx--) {
			x = inx % columnSize;
			y = inx / columnSize;
			x2 = y;
			y2 = x;
			inx2 = x2 + (y2*3);
			tmp = input[inx2];
			input[inx2] = input[inx];
			input[inx] = tmp;
		}
		return input;
	}
}
