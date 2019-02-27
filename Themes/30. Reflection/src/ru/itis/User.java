package ru.itis;

/**
 * 03.05.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User {
    private String name;
    private int age;
    private Boolean isHuman;

    public User() {
        this.name = "DEFAULT_NAME";
        this.age = 1;
        this.isHuman = true;
    }

    public User(String name, int age, Boolean isHuman) {
        this.name = name;
        this.age = age;
        this.isHuman = isHuman;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getHuman() {
        return isHuman;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHuman=" + isHuman +
                '}';
    }
}
