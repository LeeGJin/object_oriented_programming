package Week2;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        //실습문제5 : 화씨를 섭씨로 변환
        Scanner sc = new Scanner(System.in);

        System.out.print("화씨 온도 입력 : ");
        float Fahrenheit = sc.nextFloat();

        System.out.printf("섭씨 온도 : %.3f", ((float)5/9)*(Fahrenheit-32));
    }
}
