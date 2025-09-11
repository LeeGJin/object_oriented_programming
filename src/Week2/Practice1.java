package Week2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //실습문제1 : 단어와 숫자 입력 받기
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        System.out.println("출력 문자열 : " + line);
        int num = sc.nextInt();
        System.out.println("출력 정수 : " + num);
    }
}
