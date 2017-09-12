import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		// int a[] = {1, -3, 4, 2, 1};
		int a[] = new int[5];
		a[0] = 1;
		a[1] = -3;
		a[2] = 4;
		a[3] = 2;
		a[4] = 1;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		Scanner scanner = new Scanner(System.in);

		int b[] = new int[5];

		for (int i = 0; i < b.length; i++) {
			b[i] = scanner.nextInt();
		}
	}
}