package alproid.github.Example.Puzzlers.Swap;

public class SwapWithoutTemporary {
	public static void main(String[] args) {
		int x = 13;
		int y = 7;

		System.out.println(Integer.toBinaryString(x)); // 1101 // binary
		System.out.println(Integer.toBinaryString(y)); // 111 //binary

		System.out.println("x:" + x + " y:" + y);

		x = x ^ y;
		y = y ^ x;
		x = x ^ y;

		System.out.println("x:" + x + " y:" + y);
	}
}
