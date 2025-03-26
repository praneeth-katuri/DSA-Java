package patterns;

public class Rectangle {
	public void print1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void print2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void print3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void print4(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < n-1; j++) {
					for (int k = 0; k <=j; k++) {
						System.out.println("* ");
					}
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		print2(5);

	}

}
