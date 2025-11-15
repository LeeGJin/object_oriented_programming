package Week11.Practice5;

/**
 * 실습 문제 5: 추상 클래스와 상속을 이용, 도형 면적과 둘레 구하기
 * • 문제
 * – 인터페이스로 구현했던 IShape을 추상 클래스인 AbstractShape으로 변경
 * – 사각형과 원의 면적과 둘레를 구하는 메소드를 포함하는 ARectangle과 ACircle 클래스를 AbstractShape으로부터 상속 받아 구현
 * – 사각형과 원 클래스 객체를 생성해서 면적과 둘레를 화면에 출력
 *
 * • 요구사항
 * – 면적과 둘레는 소수점 둘째 자리까지 출력
 */

public class TestShape {
    public static void main(String[] args) {
        ARectangle r = new ARectangle(20.0, 10.0);
        ACircle c = new ACircle(10);
        System.out.printf("사각형의 면적: %.2f\n", r.getArea());
        System.out.printf("사각형의 둘레: %.2f\n", r.getPerimeter());
        System.out.printf("원의 면적: %.2f\n", c.getArea());
        System.out.printf("원의 둘레: %.2f\n", c.getPerimeter());
    }
}
