package Week12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        m1.put("Windows", "2000");
        m1.put("Windows", "XP"); //replacement
        m1.put("Language", "Java");
        m1.put("Website", "smu.ac.kr");

        System.out.println("iterator를 이용한 while문 출력");
        Iterator<String> keys = m1.keySet().iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            System.out.printf("key = %s, value = %s\n", key, m1.get(key));
        }

        System.out.println("\nentry를 이용한 for문 출력");
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            System.out.printf("key = %s, value = %s\n", entry.getKey(), entry.getValue());
        }
    }
}
