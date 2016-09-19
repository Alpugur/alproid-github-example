package alproid.github.Example.Puzzlers.Numbers.Decimal;

import java.math.BigDecimal;

public class DecimalSubstraction {
	public static void main(String[] args) {
		System.out.println(2.00 - 1.1 +"\n");	// 0.8999999999999999
		
//		Java’da , float ve double primitive veri tipleri “floating number” tanimlamak icin kullanilmaktadir.
//		double ve float , 2’lik sistemde fraction/çok küçük miktar olarak saklanmaktadir.
//		1/4 + 1/8 + 1/16 + …
//
//		Bazi double degerler icin kesin olarak bu sekilde/(binary floating point) bir ifade mumkun olmamaktadir.
//
//		Bir cozum olarak printf metodu ile formatlama yapabiliriz fakat bu yontem genel olarak onerilmemektedir.
		
		// Printf ile
		System.out.printf("%.2f\n", 2.00 - 1.1);	// 0.90
		System.out.printf("%.2f\n", 2.00 - 1.2);	// 0.80
		System.out.printf("%.2f\n", 2.00 - 1.3);	// 0.70
		
//		Bir baska cozum olarak java.math.BigDecimal sinifini kullanabiliriz. Burada dikkat etmemiz gereken nokta herzaman BigDecimal(String) yapilandiricini kullanmamiz gerekli. BigDecimal(double) kullanirsak arguman olarak verdigimiz degerin tam degerini (exact value) kullanarak bir BigDecimal objesi olusturacaktir.
//		Ornegin ; 1.1 degeri 1.100000000000000088817841970012523233890533447265625 olarak ifade edilmektedir.
		 
		System.out.println(new BigDecimal(1.1));									// 1.100000000000000088817841970012523233890533447265625
		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10))); 	// 0.899999999999999911182158029987476766109466552734375
		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal("1.10"))); 	// 0.90
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));// 0.90
		
		// Monetary Calculation icin int , long ya da BigDecimal tiplerini kullanmamiz gerekmektedir.
	}
}
