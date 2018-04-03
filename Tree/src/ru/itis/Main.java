package ru.itis;

public class Main {

    public static void main(String[] args) {
        int array[] = {5, 4, 8, 2, 5, 6, 10, 1, 3, 6, 7, 4};

        TreeBstImpl<Integer> tree = new TreeBstImpl<>();

        for (int i = 0; i < array.length; i++) {
            tree.insert(array[i]);
        }

        tree.print();
//        Node a = new Node(5);
//        Node b = new Node(4);
//        Node c = new Node(8);
//        Node d = new Node(2);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(10);
//        Node h = new Node(1);
//        Node i = new Node(3);
//        Node j = new Node(6);
//        Node k = new Node(7);
//        Node l = new Node(4);
//
//        a.setLeft(b);
//        a.setRight(c);
//        b.setLeft(d);
//        b.setRight(e);
//        d.setLeft(h);
//        d.setRight(i);
//        i.setRight(l);
//        c.setLeft(f);
//        c.setRight(g);
//        f.setLeft(j);
//        f.setRight(k);
    }
}
