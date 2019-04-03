package ru.itis;

import java.lang.reflect.Constructor;
import java.util.List;

public class MainSimple {

    public static void simple(Object ... args) throws Exception {


        Constructor constructors[] = Simple.class.getConstructors();
        for (Constructor constructor : constructors) {
            for (Class classa : constructor.getParameterTypes())
            System.out.println(classa.getTypeName());
        }
    }
    public static void main(String[] args) throws Exception {
        simple(10);
    }
}
