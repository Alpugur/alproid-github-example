package alproid.github.Example.Puzzlers.Swap;

public class SwapWithTemporary {
	public static void main(String[] args) {

		int x = 13;
		int y = 7;

		System.out.println("x:" + x + " y:" + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x:" + x + " y:" + y);

	}
}
