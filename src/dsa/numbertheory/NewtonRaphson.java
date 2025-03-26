package dsa.numbertheory;

public class NewtonRaphson {
	public static double newtonRaphson(double N, double epsilon) {
		// epsilon controls precision 10^-d where d is upto how many decimal point you
		// need
		double x = N;

		while (true) {
			double fx = x * x - N;
			double fpx = 2 * x;

			double nextX = x - (fx / fpx);

			if (Math.abs(nextX - x) < epsilon) {
				break;
			}
			x = nextX;
		}
		return x;
	}
}
