import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int n = scanner.nextInt();

	if (n%2 == 0) {
		System.out.println("EVEN");
	} else {
		System.out.println("ODD");
	}
}