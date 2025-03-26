package dsa.recursion;

public class ArraySum {
	public static int arraySum(int[] arr, int n) {
		if (n == 1)
			return arr[0];

		return arr[n - 1] + arraySum(arr, n - 1);
	}

}