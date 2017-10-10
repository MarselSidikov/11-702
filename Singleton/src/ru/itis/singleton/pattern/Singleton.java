package ru.itis.singleton.pattern;

/**
 * 10.10.2017
 * Singleton
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Singleton {
    // закрытое поле
    // статическое
    // оно - константное, то есть эта переменная инициализируется только один раз
    // содержит ссылку на объект класса
    private static final Singleton instance;

    private Singleton() {

    }

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

}
