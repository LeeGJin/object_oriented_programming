package Homework;

import java.util.Scanner;

/**
 * 5장 개념 확인 과제
 * 문제
 * - 최대공약수는 뺄셈 대신 나머지 연산을 이용해 구할 수도 있습니다.
 *   아래 알고리즘을 재귀호출을 이용하도록 구현하고, 다시 반복문으로도 바꿔 보세요.
 * - 함수의 이름과 형태는 앞에 소개한 것과 동일하게 int gcd(int, int)로 하며, 결과도 똑같이 나와야 합니다.
 * - 콘솔에서 두 수를 입력받아 최대공약수를 출력
 *
 * 알고리즘 (재귀호출)
 * 1. 두 개의 정수 m, n을 매개 변수로 받음
 * 2. n이 0이라면 m을 반환하고 함수 실행 종료
 * 3. 첫번째 인자로 m과 n중 작은 수를, 두번째 인자로 큰 수를 작은 수로 나눈 나머지를 gcd 함수에 넣고 호출
 */

public class Homework4 {
    int gcd(int n, int m) {
        if (n == 0) { return m; }
        if (m == 0) { return n; }

        if (n == m) { return n; }
        else if (n > m) { return gcd(n-m, m); }
        else { return gcd(n, m-n); }
    }

    int gcdRoof(int n, int m) {
        if (n == 0) { return m; }
        if (m == 0) { return n; }
        if (n == m) { return n; }

        while (n != m) {
            if (n > m) { n -= m; }
            else { m -= n; }
        }
        return n;
    }

    public static void main(String[] args) {
        Homework4 gcd= new Homework4();
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.print("두 수를 입력하세요 : ");
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.printf("두 수의 최대공약수는 %d입니다.\n", gcd.gcd(n, m));

        System.out.printf("두 수의 최대공약수는 %d입니다. (반복문)\n", gcd.gcdRoof(n, m));
    }
}
