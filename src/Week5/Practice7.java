package Week5;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        //실습문제7 : 정수 입력 받고 화면에 출력하되, 0이면 다시 입력 받고, 100이상이면 종료
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            num = sc.nextInt();
            if (num == 0) continue;
            System.out.println(num);
        } while (num < 100);
    }
}
