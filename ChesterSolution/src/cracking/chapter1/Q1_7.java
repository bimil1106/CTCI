package cracking.chapter1;

public class Q1_7 {
	static void setRowAndColZero(int[][] matrix) {
		int width = matrix.length;
		int height = matrix[0].length;
		System.out.println(String.format("It's %dx%d matrix", width, height));
		boolean[] col=new boolean[width];
		boolean[] row=new boolean[height];
		scanZeros(matrix, width, height, col, row);
		setZeros(matrix, width, height, col, row);
	}

	private static void scanZeros(int[][] matrix, int width, int height, boolean[] col, boolean[] row) {
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				if (matrix[i][j]==0) {
					col[i]=true;
					row[j]=true;
				}
			}
		}
	}

	private static void setZeros(int[][] matrix, int width, int height, boolean[] col, boolean[] row) {
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				if (col[i] || row[j])
					matrix[i][j]=0;
			}
		}
	}
}
