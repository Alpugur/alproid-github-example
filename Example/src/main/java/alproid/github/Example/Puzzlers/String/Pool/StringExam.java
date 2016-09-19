package alproid.github.Example.Puzzlers.String.Pool;

public class StringExam {
	public static void main(String[] args) {

		String lang1 = "java";
		String lang2 = "java";

		System.out.println(lang1 == lang2);

		// ya da

		String lang3 = "java8";
		String lang4 = "java" + "8";

		System.out.println(lang3 == lang4);

		// == kontrolu , reference type degiskenler icin , bu iki reference type
		// degisken ayni objeyi(identical) gosteriyor mu sorusuna cevap doner.
		// Yukaridaki kod ornegimiz true dondugune gore lang1 ve lang2 reference
		// type degiskeni ayni objeyi gostermektedir.
		// NOT : Javada , 8 primitive tip disinda her sey objedir.
		// java.lang.String , java.lang.Integer , int[] tipleri gibi.
		// String’ler icin bazi ozel durumlar mevcuttur , Java’da Heap’in ozel
		// bir bolumu olarak String Pool bolgesi bulunmaktadir.

		// All literal strings and string-valued constant expressions are
		// interned.
		// Butun String literalleri ve String degere sahip Constant
		// Expression’lar interned ozellige sahiptir.

	}
}
