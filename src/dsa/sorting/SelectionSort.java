package dsa.sorting;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int length = arr.length;
		int minIndex;
		int temp;
		for (int i = 0; i < length; i++) {
			minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < minIndex) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

}
