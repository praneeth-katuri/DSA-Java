package dsa.sorting;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int length = arr.length;
		int key, j;
		for (int i = 1; i < length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1] = key;
		}
	}
}
