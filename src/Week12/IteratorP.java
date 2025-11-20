package Week12;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorP {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Seoul");
        cities.add("Tokyo");
        cities.add("Washington, D.C.");
        cities.add("Beijing");

        System.out.println("While문을 이용한 출력");
        Iterator iter = cities.iterator();
        while (iter.hasNext()) {
            String s = (String) iter.next();
            System.out.println(s);
        }

        System.out.println("\nfor문을 이용한 출력");
        for (Iterator itera = cities.iterator(); itera.hasNext(); ) {
            String s = (String) itera.next();
            System.out.println(s);
        }
    }
}
