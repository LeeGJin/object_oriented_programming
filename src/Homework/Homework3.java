package Homework;

import java.util.Scanner;

/**
 * 4장 개념 확인 과제
 * 문제
 * - 몇 개의 정수를 입력받을 것인지 먼저 입력받고, 이 수 만큼 추가로 정수를 입력받아 배열에 저장해 주세요.
 * - 입력이 끝나면 입력된 수들 중 최소값과 최대값을 출력해 주세요.
 *
 * 요구사항
 * - 입력값은 항상 정수라고 가정
 * - 정수들의 입력은 공백으로 구분한다고 가정
 */

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? : ");
        int s = Integer.parseInt(sc.nextLine());
        int[] arr = new int[s];
        int max = 0, min = 0;

        System.out.print("수를 입력하세요 : ");
        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < s; i++) {
            arr[i] = Integer.parseInt(line[i]);
            if (i == 0) {
                min = arr[i];
                max = arr[i];
                continue;
            }
            else {
                if (arr[i] <= min) min = arr[i];
                if (arr[i] >= max) max = arr[i];
            }
        }

        System.out.printf("최대값 : %d\n", max);
        System.out.printf("최소값 : %d\n", min);

        sc.close();
    }
}
