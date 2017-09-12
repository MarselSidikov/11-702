class Program2 {
	public static void main(String[] args) {
		int x = 6;
		int y = x;
		y = 8;
		System.out.println(x);

		int a[] = {1, 2, 3, 4, 5};
		int b[] = a;
		b[2] = 100;
		System.out.println(a[2]);

	}
}