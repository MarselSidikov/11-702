package ru.itis;

/**
 * 19.09.2017
 * Program2
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program2 {

    public static boolean isPrime(int number) {
        // если number - 2, 3 - сразу возвращаем true

        // организовать цикл i = 2, sqrt(x) -> i * i <= x
        // в цикле если x поделился нацело на i, вовзращаем - false
        // если в цикле ничего не нашли - возвращаем true
        return false;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = sum(5, 11);
        System.out.println(x);
    }
}
