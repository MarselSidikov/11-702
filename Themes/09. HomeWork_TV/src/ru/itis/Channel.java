package ru.itis;

import java.time.LocalTime;

/**
 * 17.10.2017
 * Channel
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Channel {
    private final int MAX_SHOWS_COUNT = 4;
    private Show shows[];
    private int count;
    private String name;

    public Channel(String name) {
        this.count = 0;
        this.shows = new Show[MAX_SHOWS_COUNT];
        this.name = name;
    }

    public void add(Show show) {
        this.shows[count] = show;
        count++;
    }

    public String getCurrentShowName() {
        LocalTime currentTime = LocalTime.now();
        for (Show show : shows) {
            if (currentTime.isAfter(show.getStartTime()) &&
            currentTime.isBefore(show.getFinishTime())) {
                return show.getName();
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }
}
