package ru.itis;

/**
 * 14.11.2017
 * MainOutOfMemoryError
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainOutOfMemoryError {
    public static void main(String[] args) {
        int a[] = new int[Integer.MAX_VALUE];
    }
}
