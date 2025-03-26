package dsa.sorting;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
		int length = arr.length;
		int temp;
		boolean swapped;
		for (int i = 0; i < length - 1; i++) {
			swapped = false;
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

}
