package alproid.github.Example.Puzzlers.String.Replace;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSeparator {

	public static void main(String[] args) {

		String className = FileSeparator.class.getName();
		// System.out.println(className.replaceAll(Pattern.quote("."),
		// File.separator));

		// Yukarıdaki ornegi Windowsta calistirdigimizda Exception aliriz.
		// Unix işletim sistemlerinde böyle bir hata alınmaz.

		// Bunun nedeni File.seperator Windows için back-slash karakteridir(\)
		// back-slash karakteri (\) escape karakteridir , tek basina
		// invalid/gecersiz olacaktir. Bu problemi cozmek icin
		// java.util.regex.Matcher.quoteReplacement metodunu kullanabiliriz.

		System.out.println(className.replaceAll(Pattern.quote("."), Matcher.quoteReplacement(File.separator)));
	}
}
