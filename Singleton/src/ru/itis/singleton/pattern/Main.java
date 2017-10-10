package ru.itis.singleton.pattern;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
    }
}
