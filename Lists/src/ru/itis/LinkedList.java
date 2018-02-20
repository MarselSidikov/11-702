package ru.itis;

/**
 * 13.02.2018
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LinkedList implements List {

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
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
    public Object get(int index) {
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
    public void addToBegin(Object object) {
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
    public void add(Object element) {
        Node newNode = new Node(element);
        tail.next = newNode;
        tail = newNode;
        count++;
    }

    @Override
    public void remove(Object element) {

    }

    @Override
    public boolean contains(Object element) {
        return false;
    }
}
