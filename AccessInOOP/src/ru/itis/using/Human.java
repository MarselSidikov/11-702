package ru.itis.using;

/**
 * 03.10.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    private int age;
    private String name;

    public Human() {
        this.age = 0;
        this.name = "DEFAULT_NAME";
    }

    public Human(int age, String name) {
        setName(name);
        setAge(age);
    }

    // методы доступа
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.err.println("Неверный возраст");
            System.err.println("Задано значение по умолчанию");
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
