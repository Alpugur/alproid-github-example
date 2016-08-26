package alproid.github.Example.Arrays;

import java.util.Arrays;
import java.util.Random;

public class JavaUtilArraysDemo {

	int[] baseArray = new int[10];

	public JavaUtilArraysDemo() {
		Random r = new Random();
		for (int i = 0; i < baseArray.length; i++) {
			int rndInt = r.nextInt();
			int sayi = rndInt % 100;
			baseArray[i] = sayi;
		}
		System.out.println("Base array: ");
		prtln(baseArray);
	}

	public static void main(String[] args) {
		JavaUtilArraysDemo demo = new JavaUtilArraysDemo();
		// demo.copy();
		// demo.copyRange();
		// demo.sort();
		demo.search(5);
		// demo.fill(5);
	}

	public void copy() {
		// Copies the specified array, truncating or padding with zeros (if
		// necessary) so the copy has the specified length.
		System.out.println("\nCopying the array: ");
		int[] copyOfArray = Arrays.copyOf(baseArray, baseArray.length);
		prtln(copyOfArray);
		int[] copyOfArray2 = Arrays.copyOf(baseArray, baseArray.length + 2);
		prtln(copyOfArray2);
	}

	public void copyRange() {
		// Copies the specified range of the specified array into a new array.
		// The initial index of the range (from) must lie between zero and
		// original.length, inclusive.
		System.out.println("\nCopying the range of the array: ");
		int[] copyOfRangeArray = Arrays.copyOfRange(baseArray, 1, 6);
		prtln(copyOfRangeArray);
	}

	public void search(int key) {
		// Returns an int value for the index of the specified key in the
		// specified array. Returns a negative number if the specified key is
		// not found in the array. For this method to work properly, the array
		// must first be sorted by the sort method.
		System.out.println("\nSearching " + key + " in an array");
		int index = Arrays.binarySearch(baseArray, key);
		System.out.println("Index of " + key + ": " + index);
	}

	public void fill(int key) {
		// Fills all elements of the specified array with the specified value.
		System.out.println("\nFilling an array with " + key);
		Arrays.fill(baseArray, key);
		prtln(baseArray);

	}

	public void sort() {
		// Sorts the specified array into ascending numerical order.
		System.out.println("\nSorting an array: ");
		Arrays.sort(baseArray);
		prtln(baseArray);
	}

	public void prtln(int[] intArray) {
		for (int a : intArray) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
