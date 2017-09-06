import java.util.Scanner;

class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int s = 0;
	int a = scanner.nextInt();
	while (a != -1) {
		if (a % 2 == 0) {
			s += a;
		}
		a = scanner.nextInt();
	}
	System.out.println(s);
}
}