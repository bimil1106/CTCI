package google.top150.transposeinplace;

public class TransposeInPlace {
	/*
	 * input: a1, a2, ..., an, b1, b2, ..., bn, c1, c2, ..., cn
	 * output: a1, b1, c1, a2, b2, c2, ..., an, bn, cn
	 * the transpose should be done in place
	 */
	static int[] transpose(int[] input, int columnSize, int rowSize) {
		int size = input.length;
		int tmp, inx2;
		for (int inx=size; inx>=0; inx--) {
			inx2 = inx / columnSize + (inx % columnSize)*rowSize;
			tmp = input[inx2];
			input[inx2] = input[inx];
			input[inx] = tmp;
		}
		return input;
	}
	
	static int next(int inx, int columnSize, int rowSize) {
		return inx / columnSize + (inx % columnSize)*rowSize;
	}
}
