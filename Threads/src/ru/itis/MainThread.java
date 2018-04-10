package ru.itis;

/**
 * 10.04.2018
 * MainThread
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Thread.currentThread() - возвращает объект типа Thread, который
 * содержит информацию о текущем потоке. Из какого потока вызвали, тот и будет в currentThread
 * Thread.sleep() - усыпляет текущий поток на заданное время
 */
public class MainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Before sleep");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("After sleep");
    }
}
