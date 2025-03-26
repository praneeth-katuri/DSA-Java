package dsa.numbertheory;

public class Fibonacci {
	public void fibonacci(int n) {
		int start = 0;
		int end = 1;
		for (int i=2; i <n ; i++) {
			int sum = start + end;
			System.out.print(sum + " ");
			start = end;
			end = sum;
		}
	}
} 
