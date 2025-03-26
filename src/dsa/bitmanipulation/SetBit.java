package dsa.bitmanipulation;

public class SetBit {
	public void setBit(int n, int i) {
		n = n | (1 << i);
	}
}
