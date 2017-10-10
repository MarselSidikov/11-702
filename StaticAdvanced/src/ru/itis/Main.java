package ru.itis;

public class Main {

    public static void main(String[] args) {
        System.out.println(SomeClass.someStaticField);
        SomeClass a = new SomeClass();
        System.out.println("someField from a after initialize: " + a.someField);
        a.someField = 10;
        a.someStaticField = 100;

        SomeClass b = new SomeClass();
        b.someField = 20;
        b.someStaticField = 200;

        SomeClass.someStaticField = 500;

        System.out.println("someField from a: " + a.someField);
        System.out.println("someField from b: " + b.someField);
        System.out.println("someStaticField from a: " + a.someStaticField);
        System.out.println("someStaticField from b: " + b.someStaticField);
    }
}
