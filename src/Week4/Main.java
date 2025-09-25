package Week4;

class Hello {
    String toWhom = "world";
    Hello() {
        System.out.println("기본 생성자 호출됨");
    }
    Hello(String toWhom) {
        System.out.println("문자열 인자를 받는 생성자 호출됨");
        this.toWhom = toWhom;
    }
    void setWhom(String toWhom) { this.toWhom = toWhom;}
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}

public class Main {
    public static void main(String[] args) {
        //3장 <클래스와 객체>
        Hello h1 = new Hello();
        Hello h2 = new Hello("jsl");
    }
}
