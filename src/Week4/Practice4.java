package Week4;

import java.util.Scanner;

class Coffee {
    String origin;
    String grade;
    int degreeOfRoast;

    Coffee(String origin) {
        this.origin = origin;
    }
    Coffee(String origin, String grade) {
        this.origin = origin;
        this.grade = grade;
    }

    void roasting() {
        System.out.println("roasting... " + origin + " " + grade);
    }
    void grinding(int degree) {
        degreeOfRoast = degree;
        System.out.println("grinding... degree of roast is" + degree);
    }
    void brewing() {
        System.out.println("brewing... ");
    }
}

public class Practice4 {
    public static void main(String[] args) {
        //실습문제4 : 커피 자판기 객체 생성
        Coffee c = new Coffee("케냐", "AA");
        c.roasting();
        c.grinding(1);
        c.brewing();

    }
}
