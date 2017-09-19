package ru.itis;

/**
 * 19.09.2017
 * Program1
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program1 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        swap(x, y);
        System.out.println(x + " " + y);
    }
}
