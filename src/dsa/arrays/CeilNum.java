package dsa.arrays;

public class CeilNum {
	int findCeil(int[] arr, int num) {
		int start = 0;
		int end = arr.length - 1;
		int mid;
		int ceil = Integer.MAX_VALUE;
		while (start <= end) {
			mid = (start+end)/2;
			if (arr[mid] == num)
				return arr[mid];
			else if (arr[mid] > num) {
				ceil = arr[mid];
				end = mid-1;
			}
			else {
				start = mid + 1;
			}
		}
		return ceil;
	}
}
