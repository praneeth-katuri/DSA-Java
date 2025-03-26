package dsa.recursion;

public class Power {
	public static int xpown(int x, int n) {
		if (n == 0)
			return 1;

		int half = xpown(x, n / 2);

		if (n % 2 == 0) {
			return half * half;
		} else {
			return half * half * x;
		}
	}
}
