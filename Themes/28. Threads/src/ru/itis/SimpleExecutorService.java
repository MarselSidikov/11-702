package ru.itis;

/**
 * 10.04.2018
 * SimpleExecutorService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleExecutorService {
    public void submitTask(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
