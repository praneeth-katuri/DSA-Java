package dsa.arrays;

import java.util.*;

public class ReverseArray {

	public static int[] reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte t = sc.nextByte();

		for (byte i = 0; i < t; i++) {

			int n = sc.nextInt();

			int[] arr = new int[n];

			for (int i1 = 0; i1 < n; i1++) {
				arr[i1] = sc.nextInt();
			}

			reverse(arr);

			for (int i1 = 0; i1 < n; i1++) {
				System.out.print(arr[i1] + " ");
			}

			System.out.println();
		}

		sc.close();
	}
}
