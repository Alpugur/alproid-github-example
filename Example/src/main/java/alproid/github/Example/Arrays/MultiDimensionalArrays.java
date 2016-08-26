package alproid.github.Example.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {

		// Can do that
		int[][][] a = new int[1][][];
		int[][][] b = new int[1][2][];
		int[][][] c = new int[1][2][3];

		// Can't do that
		// int[][][] x = new int [][][3];
		// int[][][] x = new int [][4][];
		// int[][][] x = new int [2][][3];

		// Another initialize
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 5, 6, 7, 8 };
		int[] a3 = { 9, 10, 11, 12 };
		int[][] x = { a1, a2, a3 };
		
		
	}

}
