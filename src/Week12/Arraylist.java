package Week12;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] ars) {
        ArrayList strList = new ArrayList();

        strList.add("seoul");
        strList.add(5);
        strList.add(1, "busan");

        for (Object o : strList) {
            System.out.println(o);
        }
    }
}
