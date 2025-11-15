package Week11.Practice7;

class HelloFrench extends Hello {
    public HelloFrench(String whom) {
        super(whom);
    }

    @Override
    public void sayHello() {
        System.out.println("Bonjour " + getWhom());
    }
}

class HelloSpanish extends Hello {
    public HelloSpanish(String whom) {
        super(whom);
    }

    @Override
    public void sayHello() {
        System.out.println("Hola " + getWhom());
    }
}

class HelloKorean extends Hello {
    public HelloKorean(String whom) {
        super(whom);
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요. " + getWhom());
    }
}

public class TestHello {
    public static void main(String[] args) {
        Hello[] hArray = new Hello[3];
        hArray[0] = new HelloFrench("js1");
        hArray[1] = new HelloSpanish("js2");
        hArray[2] = new HelloKorean("js3");
        for (Hello hello : hArray) {
            hello.sayHello();
        }
    }
}
