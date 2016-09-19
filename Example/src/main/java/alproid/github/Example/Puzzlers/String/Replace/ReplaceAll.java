package alproid.github.Example.Puzzlers.String.Replace;

import java.util.regex.Pattern;

public class ReplaceAll {

	public static void main(String[] args) {

		String className = ReplaceAll.class.getName();

		System.out.println(className);
		System.out.println(className.replaceAll(".", "/")); // Meta character
		System.out.println(className.replaceAll("\\.", "/")); // the dot character
		// or
		System.out.println(className.replaceAll(Pattern.quote("."), "/"));

		// Result
		// alproid.github.Example.Puzzlers.ReplaceAll
		// ////////////////////////////////////////

		// Yapmak istenilen sadece . karakterini / ile değiştirmek, fakat tüm
		// karakterler / oldu peki neden? Bunun nedeni replaceAll metodundaki
		// ilk parametre regex olarak ifade edilir.nokta (.) karakteri tek
		// basina kullanildiginda meta character olarak ifade edilir. Herhangi
		// bir karakter anlamina gelmektedir. Bu nedenle ilgili String
		// literalindeki tum karakterler / karakteri ile degistirilir. Nokta
		// karakterini ifade etmek icin (\.) seklinde kullanmamiz gereklidir.

	}
}
