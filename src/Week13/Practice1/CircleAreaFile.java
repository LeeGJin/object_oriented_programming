package Week13.Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 실습 문제 1
 * • 문제
 * – circle.txt파일에 실수값으로 저장되어 있는 원의 반지름을 입력 받고 면적을 계산해서 출력하기
 * • 요구사항
 * – 상대 경로 사용해서 접근
 * java/javac 직접 사용시, circle.txt 파일은 컴파일된 클래스 파일과 같은 폴더에 있다고 가정
 * IDE (인텔리제이 아이디어 등) 사용시, circle.txt 파일을 프로젝트 폴더에 등록 (src의 상위 폴더)
 * – 최종 면적은 소수 둘째 자리까지 출력
 * – 예외 처리 코드는 추후 다시 학습할 예정 (IDE에서 예외처리 미사용시 자동 입력 가이드 제공)
 */

public class CircleAreaFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("circle.txt"));
        float r = sc.nextFloat();
        sc.close();

        System.out.printf("원의 넓이 : %.2f\n", Math.PI*r*r);
    }
}
