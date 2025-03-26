package dsa.numbertheory;

public class SquareRoot {
	public double squareRoot(int n, int p) {
		int start = 1;
		int end = n;

		double result = 0.0;
		while (start <= end) {
			int mid = (start + (end - start)) / 2;

			if (mid < n / mid) {
				result = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		for (int i = 0; i < p; i++) {
			while (result * result <= n) {
				result += p;

			}
			result -= p;
			p = p / 10;
		}
		return result;
	}
}
