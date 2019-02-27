package ru.itis;

/**
 * 26.09.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    // я хочу описать, какие возможные состяния-свойства могут быть у человека
    // ПОЛЯ - fields
    String name;
    int age;
    double height;

    // поведение - функции и процудры
    // внутри класса - методы
    void grow() {
        height += 0.01;
    }

    void age() {
        age++;
    }

}
