package ru.itis;

/**
 * 10.04.2018
 * MainEggThread
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainEggThread {
    public static void main(String[] args) {
        EggThread eggThread = new EggThread("EggThread");
        eggThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + Thread.currentThread().getName()
            + " я батя");
        }
    }
}
