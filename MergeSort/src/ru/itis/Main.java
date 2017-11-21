package ru.itis;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int array[] = {4, -10, 11, 45, 0, -23, 35, 62, 11, 0, -9, 11, -3, 4, 5, 1};

        SorterMergeImpl sorter = new SorterMergeImpl();

        sorter.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}