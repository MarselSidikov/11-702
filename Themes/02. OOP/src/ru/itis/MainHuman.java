package ru.itis;

/**
 * 26.09.2017
 * MainHuman
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainHuman {
    public static void main(String[] args) {
        // создал человка
        Human marsel = new Human();
        // задать состояние
        marsel.name = "Марсель";
        marsel.age = 23;
        marsel.height = 1.85;

        System.out.println(marsel.name +
        " " + marsel.age + " " + marsel.height);

        Human guzel = new Human();
        guzel.name = "Guzel";
        guzel.age = 18;
        guzel.height = 1.78;

        guzel = marsel;
        guzel.age = 25;
        System.out.println(marsel.age);
        marsel.grow();
        System.out.println(marsel.height);
        marsel.age();
        System.out.println(marsel.age);
    }
}
