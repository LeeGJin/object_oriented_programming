package Week6;

import java.io.PrintStream;

public class NumLessThan100 {
    //실습문제 2 : 정수값이 100보다 작은지 확인하는 함수 구현
    boolean isLessThan100(int num) {
        return (num < 100);
    }

    public static void main(String[] args) {
        NumLessThan100 numLessThan100 = new NumLessThan100();
        System.out.println(numLessThan100.isLessThan100(50));
        System.out.println(numLessThan100.isLessThan100(100));
        System.out.println(numLessThan100.isLessThan100(150));
    }
}
