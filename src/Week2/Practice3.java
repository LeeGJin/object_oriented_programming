package Week2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] arg) {
        //실습문제3 : 한 줄에 공백으로 분리된 여러 자료형의 입력값을 받을 경우
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        float num1 = Float.parseFloat(numStr);
        numStr = sc.next();
        float num2 = Float.parseFloat(numStr);
        System.out.printf("합계 : %.1f\n", num1 + num2);

        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        System.out.printf("합계 : %.1f\n", num3 + num4);
    }
}
