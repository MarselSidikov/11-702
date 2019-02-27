package ru.itis;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 03.10.2017
 * LocalDateTimeExample
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalTime beginTime = LocalTime.parse("14:00:00");
        LocalTime finishTime = LocalTime.parse("15:00:00");

        if (LocalTime.now().isAfter(beginTime) &&
                LocalTime.now().isBefore(finishTime)) {
            System.out.println("Работает");
        } else {
            System.out.println("Не работает");
        }
    }
}
