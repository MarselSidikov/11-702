package ru.itis;

/**
 * 10.04.2018
 * MainExecutorService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainExecutorService {
    public static void main(String[] args) {
        SimpleExecutorService service = new SimpleExecutorService();

        service.submitTask(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Marsel");
            }
        });

        service.submitTask(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Guzel");
            }
        });
    }
}
