package Week4;

class HelloP {
    String toWhom = "world";

    HelloP() {
        System.out.println("기본 생성자 호출됨");
    }

    HelloP(String toWhom) {
        System.out.println("문자열 인자를 받는 생성자 호출됨");
        this.toWhom = toWhom;
    }

    void setWhom(String toWhom) { this.toWhom = toWhom;}

    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}

public class Practice5 {
    public static void main(String[] args) {
        //실습문제 5: Hello 객체 배열 만들기
        HelloP[] hArr = new HelloP[3];
        hArr[0] = new HelloP();
        hArr[1] = new HelloP("홍길동");
        hArr[2] = new HelloP("허균");

        for (int i = 0; i < 3; i++) {
            hArr[i].sayHello();
        }
    }
}
