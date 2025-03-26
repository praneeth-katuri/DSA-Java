package dsa.numbertheory;

import java.util.Arrays;

public class SieveOfEratosthenes {
	public void sieveOfEratosthenes(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;

		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i < n + 1; i += p) {
					isPrime[i] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
