package ru.itis;

/**
 * 03.04.2018
 * TreeBstImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TreeBstImpl<T extends Comparable<T>> implements Tree<T> {

    static class Node<E> {
        private E value;
        private Node left;
        private Node right;

        Node(E value) {
            this.value = value;
        }
    }
    // корень
    private Node<T> root;

    public TreeBstImpl() {
        this.root = null;
    }

    public void insert(T value) {
        // вызывает другую функцию, которая возвращает корень
        // дерева с новым элементом
        this.root = insert(root, value);
    }

    public void print() {
        print(root);
    }

    private void print(Node root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    private Node insert(Node root, T value) {
        // если корня нет
        if (root == null) {
            // создаете узел и добавляете в корень
            root = new Node<>(value);
            // если значение меньше корня
        } else if (value.compareTo((T)root.value) <= 0) {
            // вставляет в левое поддерево
            root.left = insert(root.left, value);
        } else {
            // если больше - в правое поддерево
            root.right = insert(root.right, value);
        }
        // возвращаем текущий корень
        return root;
    }

    //TODO:
    public boolean remove(T value) {
        return false;
    }

    //TODO:
    public boolean contains(T value) {
        return false;
    }

    //TODO:
    @Override
    public void printByLevels() {

    }

    //TODO
    @Override
    public boolean isBst() {
        return false;
    }

    //TODO:
    public boolean equals(Object object) {
        return false;
    }
}
