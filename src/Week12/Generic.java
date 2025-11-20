package Week12;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("seoul");
        strList.add("busan");

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(new Integer(7));
        System.out.println(numList.get(0));
        numList.add(3);
        System.out.println(numList.get(1));

        Integer[] a = { 1, 2, 3 };
        List<Integer> aList = Arrays.asList(a);

        ArrayList<Integer> arrList = new ArrayList<>(aList);
        arrList.add(4);
    }
}
