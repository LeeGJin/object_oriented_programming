package Homework;

import java.util.Scanner;

/** 2장 개념 확인 과제
 * 문제
 * - 사용자로부터 5개 정수를 입력 받을 때까지 프로그램을 실행시키면서,
 *   매 숫자 입력 후에 그때까지 입력된 모든 정수값들의 합을 계산해서 출력하는 프로그램을 작성하세요.
 * 요구사항
 * - 정수 외 다른 값은 입력되지 않는다고 가정
*/
public class Homework1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요 : ");
            sum += sc.nextInt();
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }
    }
}
