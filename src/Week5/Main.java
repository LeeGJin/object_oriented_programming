package Week5;

import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {
/*        int Cup1 = 10;
        int Cup2 = 50;
        do {
            Cup1 += 10;
        } while (Cup1 < Cup2);
        System.out.println("Cup1 = " + Cup1);
        System.out.println("Cup2 = " + Cup2);*/

/*        for(int i = 10; i <= 59; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        for(int i = 10; i <= 50; i += 10) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(i + j);
                System.out.print(" ");
            }
        }*/

/*        char ch;
        Scanner sc = new Scanner(System.in);

        do {
            ch = sc.next().charAt(0);
            if (ch != 'n') {
                System.out.println(ch);
            }
            else break;
        } while (true);*/

/*        int i = 3;
        while (i < 7) {
            System.out.printf("if 전 : i = %d\n", i);
            if (i < 7) {
                i += 2;
                System.out.printf("continue 전 코드 : i = %d\n", i);
                continue;
                //System.out.printf("\"continue 후 코드 : i = %d\n", i);
            }
            System.out.println("이건 출력되면 안됨!");
        }
        System.out.printf("i = %d, 이건 출력됨\n", i);*/

/*        HelloP arr[] = new HelloP[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new HelloP();
        }
        String whom[] = { "ycho", "jsl", "everyone" };
        int index = 0;
        for (HelloP a : arr) {
            a.setWhom(whom[index]);
            index++;
        }
        for (HelloP a : arr) {
            a.sayHello();
        }*/


    }
}
