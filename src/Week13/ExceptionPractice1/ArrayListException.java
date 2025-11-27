package Week13.ExceptionPractice1;

import java.util.ArrayList;

/**
 * 실습 문제 1: ArrayList의 get() 함수를 사용할 때 예외 처리하기
 * • 문제
 * – 정수를 저장하는 ArrayList를 생성하고 1, 2, 3을 요소로 추가
 * – get() 함수를 이용해서 요소들을 추출해서 화면에 출력
 * – get() 함수는 인덱스 번호가 리스트의 요소 개수 범위를 벗어나면 IndexOutOfBoundsException을 발생시킴
 * – 이를 처리하는 코드를 작성
 * • 요구사항
 * – 인덱스 번호가 잘못되었으면 프로그램을 종료시키지 말고, 번호가 잘못되었다는 내용만 화면에 출력
 * – 인덱스 번호로 음수와 요소 개수 범위를 벗어나는 값을 이용해서 예외를 발생시켜 볼 것
 */

public class ArrayListException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        try {
            list.get(-1);
            list.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.print("인덱스가 범위를 벗어났습니다.\n");
        }
    }
}
