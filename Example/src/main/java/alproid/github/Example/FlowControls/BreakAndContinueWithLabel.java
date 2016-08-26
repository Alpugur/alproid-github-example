package alproid.github.Example.FlowControls;

public class BreakAndContinueWithLabel {
	public static void main(String[] args) {
		int[][] arrayOfInts = { { 32, 4, 67, 567, 23 }, { 12, 1, 6723, 16 }, { 1, 234, 1, 734 } };
		int searchedInt = 1;

		boolean foundIt = false;

		search: for (int i = 0; i < arrayOfInts.length; i++) {
			for (int j = 0; j < arrayOfInts[i].length; j++) {

				if (arrayOfInts[i][j] == searchedInt) {
					foundIt = true;
					System.out.println("Found " + searchedInt + " at " + i + ", " + j);
					break search;
					//try to break, continue, continue search...
				}
			}
		}

		if (!foundIt) {
			System.out.println(searchedInt + "not in the array");
		}
	}
}
