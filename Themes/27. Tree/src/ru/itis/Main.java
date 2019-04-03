package ru.itis;

public class Main {


    public static void main(String[] args) {
        int array[] = {5, 4, 8, 2, 5, 6, 10, 1, 3, 6, 7, 4};

        Tree<Integer> tree = new TreeBstImpl<>();

        for (int i = 0; i < array.length; i++) {
            tree.insert(array[i]);
        }

        tree.print();
    }
}
