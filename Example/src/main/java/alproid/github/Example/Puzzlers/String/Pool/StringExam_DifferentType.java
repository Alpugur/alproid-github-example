package alproid.github.Example.Puzzlers.String.Pool;

public class StringExam_DifferentType {
	public static void main(String[] args) {

		String lang1 = "java8";
		final String version = "8";
		String lang2 = "java" + version;

		System.out.println(lang1 == lang2); // true
		
//		Burada String version degiskeni final oldugu icin Constant Expression ozelligine sahiptir. Bu nedenle interned ozellik gosterir.
		
		String lang3 = "java8";
		String version_ = "8";
		String lang4 = "java" + version_;

		System.out.println(lang3 == lang4); // false
		
		// ya da
		
		String lang5 = "java8";
		String lang6 = "java" + getVersion();

		System.out.println(lang5 == lang6); // false
		
		// Benzer sekilde method invocation da Constant Expression degildir , dolayisiyla interned ozellik gostermez. Bu nedenle output false olacaktir.
		
		
		
//		java.lang.String sinifinda intern metodu yer almaktadir. Bu metot String objelerinin canonical temsili dondurur.
//		Non Constant Expression ifadeler icin intern metodu uzerinden == kontrolu yaptigimizda true donecektir.
//
//		Returns a canonical representation for the string object.
//		public native String intern();
//		System.out.println(lang1.intern() == lang2.intern()); // true
//		String objelerini karsilastirma yaparken her zaman equals metodunu kullanalim. equals metodu “meaningfully” olarak kontrol yapar.
//		new anahtar kelimesiyle String objesi olusturdugumuzda bu obje her zaman Heap’te olusur.
		
		String lang7 = new String("java8");
		String lang8 = new String("java8");

		System.out.println(lang7 == lang8); //false
		System.out.println(lang7.equals(lang8)); //true
		
		
	}
	
	public static String getVersion() {
		return "8";
	}
}
