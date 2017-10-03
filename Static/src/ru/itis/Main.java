package ru.itis;

import static ru.itis.RationalNumber.multiply;

public class Main {

    public static void main(String[] args) {
        RationalNumber a = new RationalNumber(3, 7);
        RationalNumber b = new RationalNumber(2, 5);
        // a.multiply(b);
        // RationalNumber c = a.multiply(b);
        // RationalNumber c = RationalNumber.multiply(a, b);
        RationalNumber c = multiply(a, b);
        System.out.println(c);
    }
}
