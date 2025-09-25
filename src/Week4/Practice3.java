package Week4;

class Subway {
    int line;

    //setter 함수
    void setLine(int l) {
        line = l;
    }
    void sayLine() {
        System.out.println("Line " + line + " runs");
    }
    //getter 함수
    int getLine() {
        return line;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        //실습문제3 : 지하철 호선을 정한 후, 이를 운행하는 클래스 만들기
        Subway s1 = new Subway();
        s1.setLine(2);
        s1.sayLine();

        Subway s2 = new Subway();
        s2.setLine(7);
        s2.sayLine();

        System.out.println(s1.getLine());
        System.out.println(s2.getLine());
    }
}
