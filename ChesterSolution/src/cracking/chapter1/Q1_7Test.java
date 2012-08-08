package cracking.chapter1;

import org.junit.Test;

public class Q1_7Test {
	int[][] matrix =	{
							{  5, 24, 10,  4,  3},
							{  1, 30,  2,  8,  6},
							{  9,  0,  4,  3, 13},
							{  3, 52,  1,  0,  6},
							{  1, 62,  2,  6,  3},
							{ 13,  2,  7, 17,  6},
							{  0,  1,  9,  4,  2}
						};

	void drawTable(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			System.out.print("[ ");
			for (int j=0; j<matrix[0].length; j++) {
				System.out.print(String.format("%3d  ", matrix[i][j]));
			}
			System.out.println("]");
		}
		System.out.println();
	}
	
	@Test
	public void testSetRowAndColZero() {
		System.out.println("Original table: ");
		drawTable(matrix);
		Q1_7.setRowAndColZero(matrix);
		drawTable(matrix);
	}

}
