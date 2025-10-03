package Week5;

enum Light {
    RED(30), AMBER(10), GREEN(30);

    int second;
    Light(int second) {
        this.second = second;
    }
    int getSecond() {return second;}
}

public class Practice11 {
    public static void main(String[] args) {
        //실습문제11 : 교통 신호등을 enum 클래스로 표현하기
        for (Light light : Light.values()) {
            System.out.printf("light : %s, second : %d\n", light, light.getSecond());
        }
    }
}
