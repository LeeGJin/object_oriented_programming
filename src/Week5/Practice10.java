package Week5;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String zone = sc.next();// 프라임존으로 지정

        switch (zone) {
            case "prime":
                System.out.println("프라임존 표는 11000원.");
                break;
            case "standard":
                System.out.println("스탠다드존 표는 10000원.");
                break;
            case "economy":
                System.out.println("이코노미존 표는 9000원.");
                break;
            default:
                System.out.println("좌석 종류를 잘못 입력했습니다.");
        }
    }
}
