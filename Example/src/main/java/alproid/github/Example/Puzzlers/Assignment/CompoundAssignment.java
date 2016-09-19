package alproid.github.Example.Puzzlers.Assignment;

public class CompoundAssignment {
	public static void main(String[] args) {

		// x+=i; this statement is simple assignment
		// x=x+i; this statement is compound assignment

		short x = 0;
		int i = 123456;
		// x = x + i; ifadesi derleme hatası verir, "possible loss of precision"
		x += i;// Burada gizli cast işlemi yapılmıştır. aşağıdaki gibi
				// çalışmıştır.
		x = (short) (x + i);
		
		
		Object xx = "injava";
		String ii = "wetrust.com";

		xx = xx + ii;

		Object y = "injava";
		String j = "wetrust.com";

		y += j;
		// The operator += is undefined for the argument type(s) Object, String
		// JDK 6
		// It is legal with JDK 7 , JDK8

		System.out.println(xx);
		System.out.println(y);

		String z = "aaa";
		int number = 100;
		z += number;

		System.out.println(z);
		
	}
}
