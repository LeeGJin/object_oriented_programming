package Week6;

import java.util.Scanner;

public class TestPrintNumInRange {
    //실습문제 1 : 함수를 이용해서 정수 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNumInRange printNumInRange = new PrintNumInRange(sc);
        printNumInRange.readInt();
        if (printNumInRange.isInRange(1, 100)) {
            printNumInRange.printInt();
        }
        else {
            System.out.println("1~100 범위 밖 정수가 입력되었습니다.");
        }
    }
}
