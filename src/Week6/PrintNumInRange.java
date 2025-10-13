package Week6;

import java.util.Scanner;

public class PrintNumInRange {
    int value;
    Scanner scanner;

    PrintNumInRange(Scanner scanner) {this.scanner = scanner;}

    boolean isInRange(int min, int max) {
        return (value >= min && value <= max ? true : false);
    }
    void printInt() { System.out.println(value);}
    void readInt() {
        System.out.print("정수를 입력하세요 : ");
        value = scanner.nextInt();
    }
}
