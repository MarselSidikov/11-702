class Program {
	public static void main(String[] args) {
		int n = 67;
		int a1, a2, a3, a4, a5, a6, a7;
		a7 = n % 2; n /= 2; // n = n / 2;
		a6 = n%2; n/=2;
		a5 = n%2; n/=2;
		a4 = n%2; n/=2;
		a3 = n%2; n/=2;
		a2 = n%2; n/=2;
		a1 = n%2; n/=2;
		System.out.println(a1 + "" + a2 + "" + a3 + "" + a4 + "" + a5 + "" + a6 + "" + a7);
	}
}