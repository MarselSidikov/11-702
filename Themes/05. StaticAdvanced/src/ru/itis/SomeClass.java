package ru.itis;

/**
 * 10.10.2017
 * SomeClass
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SomeClass {
    int someField;
    static int someStaticField;

    // статический инициализатор, вызывается при первом обращении к классу
    static {
        someStaticField = 666;
    }

    public SomeClass() {
        System.out.println("Constructor in SomeClass");
        someField = 777;
        someStaticField = 666;
    }
}
