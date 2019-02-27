package ru.itis;

/**
 * 10.04.2018
 * MainEggWithChicken
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Пусть есть три потока a, b, c
 * Пусть в метода потока a был вызван join у b и c
 * Тода поток a будет ждать полного завершения потоков b и c
 */
public class MainEggWithChicken {
    public static void main(String[] args) {
        EggThread eggThread = new EggThread("EggThread");
        ChickenThread chickenThread = new ChickenThread("ChickenThread");

        eggThread.start();
        chickenThread.start();

        try {
            eggThread.join();
            chickenThread.join();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + Thread.currentThread().getName()
                    + " я батя");
        }
    }
}
