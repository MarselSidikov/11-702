package ru.itis.modificators.model;

/**
 * 03.10.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    // поля
    int age;
    private String name;
    public String state;

    // метод
    void go() {
        System.out.println(name + " is going");
    }
}
