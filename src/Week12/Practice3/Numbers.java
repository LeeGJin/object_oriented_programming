package Week12.Practice3;

import java.util.ArrayList;

public class Numbers {
    private ArrayList<Integer> list = new ArrayList<>();
    private Integer min;
    private Integer max;
    
    public Numbers(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public void setNumbers() {
        for (Integer i = min; i <= max; i++) {
            if ((i%4 == 0) && (i%5 != 0)) {
                list.add(i);
            }
        }
    }

    public Integer sumList() {
        Integer sum = 0;
        for (Integer i : list) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}
