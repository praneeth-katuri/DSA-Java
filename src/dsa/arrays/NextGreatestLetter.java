package dsa.arrays;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class NextGreatestLetter {
	public char nextGreatestLetter(char[] arr, char target) {
		int start = 0;
		int end = arr.length - 1;
		int mid;
		char ans = ' ';
		if (target >= arr[end]) {
			return arr[0];
		}
		while (start <= end) {
			mid = (start + end) / 2;

			if (arr[mid] > target) {
				ans = arr[mid];
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

}
