package Week3;

class Hello {
    void sayHello () {
        System.out.println("Hello");
    }
}

public class Practice1 {
    public static void main (StringPractice[] args) {
        //실습문제1 : Hello 프로그램으로 객체지향, 함수 방식 비교하기
        Hello hello = new Hello();
        hello.sayHello();


        Hello h1 = new Hello();
        h1.sayHello();;
        Hello h2 = new Hello();
        h2.sayHello();
    }
}
