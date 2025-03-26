package dsa.recursion;

public class Fibonacci {

	public void print(int n, int a, int b) {
		if (n > 0) {
			System.out.print(a + " ");
			print(n - 1, b, a + b);
		}

	}

	public int nth(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return nth(n - 1) + nth(n - 2);
	}

}
