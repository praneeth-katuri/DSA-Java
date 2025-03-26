package dsa.bitmanipulation;

public class Power {
	public int apowb(int a, int b) {
		int ans = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				ans = ans * b;
			}
			a = a * a;
			b >>= 1;
		}
		return ans;
	}
}
