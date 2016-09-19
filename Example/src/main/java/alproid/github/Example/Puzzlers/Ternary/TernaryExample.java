package alproid.github.Example.Puzzlers.Ternary;

public class TernaryExample {
	public static void main(String[] args) {
		int point = 95;
		String result = point < 50 ? "Fail" : "Success";
		System.out.println(result);

		String result_2 = point < 50 ? "F" : point > 100 ? "A" : "B";
		System.out.println(result_2);
	}
}
