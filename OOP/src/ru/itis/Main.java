package ru.itis;

public class Main {
    public static int count = 0;

    public static void add(int array[], int element) {
        array[count] = element;
        count++;
    }
    public static void main(String[] args) {
        int array[] = new int[10];
        add(array, 6);
        add(array, 7);
        add(array, 10);

    }
}
