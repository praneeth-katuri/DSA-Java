package dsa.bitmanipulation;

public class ResetBit {
	public void resetBit(int n, int i) {
		n = n ^ (~(1 << i));
	}

}
