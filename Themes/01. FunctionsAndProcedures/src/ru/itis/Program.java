package ru.itis;
import java.util.Scanner;

/*
1. У каждой подпрограммы должно быть нормальное имя
2. Каждая подпрограмма делает СТРОГО ОДНУ ЗАДАЧУ,
ОТРАЖЕННУЮ В ИМЕНИ ПОДПРОГРАММЫ
3. Именование:
подпрограммы, локальные переменные, формальные параметры
 - camelCase

 */
class Program {
    // подпрограмма
    // bubbleSort - название подпрограммы
    // a[] - формальный параметр
    public static void bubbleSort(int a[]) {
        // тело подпрограммы
        for (int i = a.length-1; i>=0; i--) {
            for (int j = 0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void readArray(int a[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }

    // main - подпрограмма
    // args - формальный параметр
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x[] = new int[n];
        readArray(x);
        // вызов подпрограммы
        // x - аргумент
        bubbleSort(x);
        printArray(x);
        System.out.println();
    }
}