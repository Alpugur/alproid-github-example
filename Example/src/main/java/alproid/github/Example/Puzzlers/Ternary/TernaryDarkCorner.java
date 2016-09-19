package alproid.github.Example.Puzzlers.Ternary;

public class TernaryDarkCorner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;

		System.out.println(true ? x : 0); // result:X cunku x degiskenin tipi
											// char'dır.
		System.out.println(false ? i : x); // result:88 cunku i degisken tipi
											// int'tir. char tipindeki x
											// degiskeni widening ile int tipine
											// yükseltme işlemi yapılır.

	}
}
