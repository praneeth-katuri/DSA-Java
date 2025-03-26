package dsa.bitmanipulation;

public class CheckBit {
	public boolean checkBit(int n, int i) {
		return (n & (1 << i)) != 0;
	}
}
