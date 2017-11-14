package ru.itis;

/**
 * 14.11.2017
 * MainStackOverflowError
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainStackOverflowError {

    public static void rec() {
        System.out.println("делает программу, которая");
        rec();
    }

    public static void main(String[] args) {
        rec();
    }
}
