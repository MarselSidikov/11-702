package ru.itis;

public class Main {

    public static void main(String[] args) {
		int N = 5;
	    int a = 1623;
	    int b = 1243;

	    int aArray[] = new int[10];
	    int bArray[] = new int[10];

	    int i = 1;
	    while (a != 0) {
	    	aArray[a % 10] = N - i;
	    	bArray[b % 10] = N - i;
	    	a = a / 10;
	    	b = b / 10;
	    	i++;
		}

		int count = 0;
		for (int j = 0; j < 10; j++) {
	    	if (aArray[j] != bArray[j] && aArray[j] != 0 &&
					bArray[j] != 0) {
	    		count++;
			}
		}

		System.out.println(count);
	}
}
