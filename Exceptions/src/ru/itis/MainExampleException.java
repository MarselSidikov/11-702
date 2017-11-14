package ru.itis;

import java.util.Scanner;

public class MainExampleException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a / b);
    }
}
