package dsa.recursion;

public class DecToBin {
	public static int convert(int n) {
		if (n == 0)
			return 0;

		return (n % 2) + 10 * convert(n / 2);
	}
}
