package ru.itis;

/**
 * 17.10.2017
 * RemoteController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RemoteController {
    private TV tv;

    private String model;

    public RemoteController(TV tv, String model) {
        this.tv = tv;
        this.model = model;
    }

    public void switchTV(String channelName) {
        tv.printShow(channelName);
    }
}
