package ru.itis;

/**
 * 03.10.2017
 * RationalNumber
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    // реализовать сокращение дроби - автоматически
//    public void multiply(RationalNumber that) {
//        this.numerator = this.numerator * that.numerator;
//        this.denominator = this.denominator * that.denominator;
//    }

//    public RationalNumber multiply(RationalNumber that) {
//        return new RationalNumber(
//                this.numerator * that.numerator,
//                this.denominator * that.denominator);
//    }

    public static RationalNumber multiply(RationalNumber x, RationalNumber y) {
        return new RationalNumber(
                x.numerator * y.numerator,
                x.denominator * y.denominator);
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
}
