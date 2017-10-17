package ru.itis;

import java.time.LocalTime;

/**
 * 17.10.2017
 * Show
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Show {
    private LocalTime startTime;
    private LocalTime finishTime;
    private String name;

    public Show(LocalTime startTime, LocalTime finishTime, String name) {
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.name = name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getFinishTime() {
        return finishTime;
    }

    public String getName() {
        return name;
    }
}
