package dsa.arrays;

public class floorNum {
	int findFloor(int[] arr, int num) {
		int start = 0;
		int end = arr.length - 1;
		int floor = Integer.MIN_VALUE;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == num) {
				return arr[mid];
			} else if (arr[mid] > num) {
				end = mid - 1;
			} else {
				floor = arr[mid];
				start = mid + 1;
			}
		}
		return floor;
	}
}
