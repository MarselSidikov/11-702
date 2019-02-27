package ru.itis;

/**
 * 17.10.2017
 * TV
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TV {
    private static final TV instance;
    private final int MAX_CHANNELS_COUNT = 10;
    private TV() {
        this.channels = new Channel[MAX_CHANNELS_COUNT];
        this.count = 0;
    }

    static {
        instance = new TV();
    }

    public static TV getInstance() {
        return instance;
    }

    private Channel channels[];
    private int count = 0;

    public void add(Channel channel) {
        channels[count] = channel;
        count++;
    }

    public void printShow(String channelName) {
        for (int i = 0; i < count; i++) {
            if (channels[i].getName().equals(channelName)) {
                System.out.println(channels[i].getCurrentShowName());
            }
        }
    }
}
