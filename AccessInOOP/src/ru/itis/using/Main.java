package ru.itis.using;

/**
 * 03.10.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
//        human.name = "Марсель";
//        human.age = -23;
        human.setAge(-23);
        human.setName("Марсель");
        System.out.println(human.getAge());
        Human human1 = new Human(17, "Максим");
    }
}
