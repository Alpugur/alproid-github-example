package alproid.github.Example.Puzzlers.Overflow;

public class LongDivision {
	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

		System.out.println(MICROS_PER_DAY);
		System.out.println(MILLIS_PER_DAY);
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

		final long MICROS_PER_DAY_1 = 24L * 60 * 60 * 1000 * 1000; 
		final long MILLIS_PER_DAY_1 = 24L * 60 * 60 * 1000;
		// L literali kullanarak default int olan sayıları long tipine widening yapmış oolduk
		
		System.out.println(MICROS_PER_DAY_1);
		System.out.println(MILLIS_PER_DAY_1);
		System.out.println(MICROS_PER_DAY_1 / MILLIS_PER_DAY_1);
	}
}
