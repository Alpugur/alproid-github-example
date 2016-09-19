package alproid.github.Example.Puzzlers.Oddity;

public class Oddity {

	public static boolean isOdd(int number) {
		return number % 2 == 1;
	}

	// Yukarıdaki metodun doğru yazimi
	public static boolean isOdd_notEqual(int number) {
		return number % 2 != 0;
	}

	// Performansın önemli olduğu durumda % yerine bitwise & kullanılabilir.
	public static boolean isOdd_withBitwise(int number) {
		return (number & 1) != 0;
	}

	public static void main(String[] args) {
	
		System.out.println("IsOdd:" + isOdd(5));	// true
		System.out.println("IsOdd:" + isOdd(10));	// false
		System.out.println("IsOdd:" + isOdd(-5));	// false çünkü sonuç 1 degil -1 olacaktir.
		System.out.println("IsOdd:" + isOdd(-10) +"\n");	// false
		///////////////////////////////////////////
		System.out.println("isOdd_notEqual:" + isOdd_notEqual(5));	// true
		System.out.println("isOdd_notEqual:" + isOdd_notEqual(10));	// false
		System.out.println("isOdd_notEqual:" + isOdd_notEqual(-5));	// true
		System.out.println("isOdd_notEqual:" + isOdd_notEqual(-10) + "\n");	// false
		///////////////////////////////////////////
		System.out.println("isOdd_withBitwise:" + isOdd_withBitwise(5));	// true
		System.out.println("isOdd_withBitwise:" + isOdd_withBitwise(10));	// false
		System.out.println("isOdd_withBitwise:" + isOdd_withBitwise(-5));	// true
		System.out.println("isOdd_withBitwise:" + isOdd_withBitwise(-10));	// false
	}
}
