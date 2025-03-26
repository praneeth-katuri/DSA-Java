package dsa.numbertheory;

public class CountNums {
	
	public static int count(int num, int k) {
		int count = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			if (digit == k) {
				count++;
			}
		}
		return count;
	}

}
