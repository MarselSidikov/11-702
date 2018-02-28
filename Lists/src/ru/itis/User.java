package ru.itis;

/**
 * 28.02.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User implements Comparable<User> {
    private String name;
    private int age;
    private int height;
    private int mark;

    public User(String name, int age, int height, int mark) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(User o) {
        return this.height - o.height;
    }

    @Override
    public String toString() {
        return this.name + " " + this.height + " " + this.age + " " + mark;
    }

    public int getMark() {
        return mark;
    }
}
