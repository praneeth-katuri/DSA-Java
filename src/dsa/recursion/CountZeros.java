package dsa.recursion;

public class CountZeros {
	public int count(int n) {
		int count = (n % 10 == 0) ? 1 : 0;
		
		return count + count(n/10);
	}
}
