package alproid.github.Example.Puzzlers.Unicode;

public class Unicode {
	public static void main(String[] args) {

		System.out.println("a\u0022.length() + \u0022b".length());
		//char ciftTirnak = '\u0022'; // "
		System.out.println("a".length() + "b".length());

		// http://unicode-table.com/en/#0022
		// https://www.branah.com/unicode-converter

		System.out.println("\u0024".equals("$"));
		// Unicode degerlerinin translate edildigini unutmayalim ve ozellikle ”
		// karakteri konusunda dikkatli olalim.
	}
}
