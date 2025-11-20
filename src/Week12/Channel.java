package Week12;

import java.util.HashMap;
import java.util.Map;

public class Channel {
    public static void main(String[] args) {
        Map<String, Integer> channels = new HashMap<>();

        channels.put("SBS", 6);
        channels.put("KBS1", 9);
        channels.put("KBS2", 7);
        channels.put("EBS1", 10);
        channels.put("MBC", 11);

        for (Map.Entry<String, Integer> entry : channels.entrySet())
            System.out.printf("television network: %s, channel number: %d\n", entry.getKey(), entry.getValue());
    }
}
