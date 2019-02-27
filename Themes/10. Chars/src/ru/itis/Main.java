package ru.itis;

public class Main {

    public static boolean isLetter(char c) {
        return c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z';
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static int convertDigitToInt(char c) {
        if (isDigit(c)) {
            return c - '0';
        } else return -1;
    }

    public static char convertIntToDigit(int digit) {
        if (digit >=0 && digit <= 9) {
            return (char)(digit + '0');
        } else return '\0';
    }

    public static void main(String[] args) {
	    char c;
	    c = 'A';
	    // c + 1 -> int
        c = (char)(c + 1);
        // char -> int - неявное
        int codeOfB = c;
        System.out.println(codeOfB);
        int кодЫ = 'Ы';
        System.out.println(кодЫ);

        int digit = 5;
        char d = convertIntToDigit(digit);
        System.out.println((int)d);
    }
}
