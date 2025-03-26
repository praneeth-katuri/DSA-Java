package dsa.recursion;

public class Factorial {
	public static int fact(int n) {
		if (n == 1)
			return 1;

		return n * fact(n - 1);
	}

}
