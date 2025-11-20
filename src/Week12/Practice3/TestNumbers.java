package Week12.Practice3;

/**
 * 실습 문제 3: 1~100 사이의 정수 중
 * 4로 나누어지고 5로 나눠지지 않는 정수의 합계
 * • 문제
 * – 1~100 범위의 정수 중에서 4로 나눠지고 5로 나눠지지 않는 값의 합계를 계산
 * – 범위에 있는 정수 한 개씩 판단해서 적합하면 리스트에 추가
 * – 최종적으로 리스트에 있는 모든 정수의 합계를 계산
 * • 요구사항
 * – 반복문을 이용해서 푸는 것이 더 쉽지만, 학습을 위해 ArrayList를 사용하기로 함
 */

public class TestNumbers {
    public static void main(String[] args) {
        Numbers n = new Numbers(1, 100);
        n.setNumbers();
        System.out.println("\nSum: " + n.sumList());
    }
}
