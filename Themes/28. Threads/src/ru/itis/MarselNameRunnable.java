package ru.itis;

/**
 * 10.04.2018
 * MarselNameRunnable
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MarselNameRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Marsel");
        }
    }
}
