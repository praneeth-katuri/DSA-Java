package dsa.numbertheory;

import java.util.*;

public class FindFactors {
	public void show(int n) {
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				factors.add(i);

				if (i != n / i) {
					factors.add(n / i);
				}
			}
		}

		for (int num : factors) {
			System.out.print(num + " ");
		}
	}
}
