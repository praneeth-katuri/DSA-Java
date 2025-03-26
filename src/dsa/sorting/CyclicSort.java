package dsa.sorting;

public class CyclicSort {
	public void cyclicSort(int[] arr) {
		int length = arr.length;
		int i = 0;
		int temp;
		while (i < length) {
			if (arr[i] != i + 1) {
				temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
			} else {
				i += 1;
			}
		}
	}
}
