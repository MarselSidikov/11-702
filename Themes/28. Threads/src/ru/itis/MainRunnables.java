package ru.itis;

/**
 * 10.04.2018
 * MainRunnables
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainRunnables {
    public static void main(String[] args) {
        Thread marselThread = new Thread(new MarselNameRunnable());
        Thread guzelThread = new Thread(new GuzelNameRunnable());

        marselThread.start();
        guzelThread.start();
    }
}
