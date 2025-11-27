package Week13.Practice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 실습 문제 2
 * • 문제
 * – "hello.txt" 파일의 내용을 모두 읽고,
 * 이를 화면에 출력하는 프로그램 작성
 * – 한 문장씩 읽고 화면에 출력
 * – 예외 처리는 나중에 학습
 * • 요구사항
 * – 상대 경로 사용해서 접근
 */

public class ReadHelloFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("hello.txt"));

        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}
