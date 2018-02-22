package ru.itis;

import java.util.Iterator;

/**
 * 13.02.2018
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LinkedList<T> implements List<T> {

    // TODO: реализовать
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }
    // ссылка на первый элемент списка
    private Node head;
    // ссылка на последний элемент списка
    private Node tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    @Override
    public T get(int index) {
        if (index < count) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        }
        return null;
    }

    @Override
    public void addToBegin(T object) {
        Node newNode = new Node(object);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        count++;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head  = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void remove(T element) {

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    public static <E extends Comparable<E>> LinkedList<E> merge(LinkedList<E> aList,
                                                                LinkedList<E> bList) {
        LinkedList<E> result = new LinkedList<>();

        Iterator<E> aIterator = aList.iterator();
        Iterator<E> bIterator = bList.iterator();

        return null;
    }
}
