package Week11.Practice6;

import Week11.Practice5.ACircle;
import Week11.Practice5.ARectangle;
import Week11.Practice5.Shape;

/**
 *실습 문제 6: 도형 면적을 다형성을 이용해서 계산하기
 * • 문제
 * – 도형의 종류에 따라 면적 계산 방법이 다름
 * – 다형성을 이용한 것과 아닌 것을 비교
 * – AbstractShape, ARectangle, ACircle 클래스를 이용할 것
 * – 부모 클래스 AbstractShape 배열에 자식 클래스 저장하고 getArea() 함수를 호출
 * • 요구사항
 * – 두 가지 버전으로 프로그램을 작성
 * – 버전 1: instanceof 연산자를 이용해서 클래스를 구분하고, 직접 자식 클래스의 getArea() 함수 호출
 * – 버전 2: 다형성을 이용해서 호출
 */

public class ShapeAreaAndPerimeter {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new ARectangle(100, 50);
        shapes[1] = new ACircle(50);

        //버전 1
        for (Shape shape : shapes) {
            if (shape instanceof ARectangle) {
                ARectangle ar = (ARectangle) shape;
                System.out.printf("%s area: %.2f\n", ar.getClass(), ar.getArea());
            }
            else if (shape instanceof ACircle) {
                ACircle ac = (ACircle) shape;
                System.out.printf("%s area: %.2f\n", ac.getClass(), ac.getArea());
            }
        }

        //버전 2
        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f\n", shape.getClass(), shape.getArea());
        }
    }
}
