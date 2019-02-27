package ru.itis;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

/**
 * 17.10.2017
 * ParkingPlace
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ParkingPlace {
    private final int PARKING_PLACE_SIZE = 10;
    private Car cars[];
    private int count;

    private LocalTime beginTime;
    private LocalTime finishTime;

    public ParkingPlace(LocalTime beginTime, LocalTime finishTime) {
        this.cars = new Car[PARKING_PLACE_SIZE];
        this.beginTime = beginTime;
        this.finishTime = finishTime;
        count = 0;
    }

    public void enterCar(Car car) {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(beginTime) && currentTime.isBefore(finishTime)) {
            if (count < PARKING_PLACE_SIZE) {
                cars[count] = car;
                count++;
            } else {
                System.err.println("Места нет, упырь");
            }
        } else {
            System.err.println("Парковка не работает");
        }
    }
}
