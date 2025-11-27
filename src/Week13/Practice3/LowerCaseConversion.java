package Week13.Practice3;

import java.io.*;

/**
 * 실습 문제 3
 * • 문제
 * – 파일에서 내용을 읽고,
 * 영문 대문자를 소문자로 변환해서 출력하기
 * • 요구사항
 * – "hello.txt"파일이 적절한 위치에 있다고 가정
 * – 영문 대문자를 소문자로 변환하는 방법은
 * Character와 String의 toLowerCase() 함수 사용
 * public static char toLowerCase(char ch);
 * public String toLowerCase();
 */

public class LowerCaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));

        int data;
        while ((data = br.read()) != -1) {
            char ch = Character.toLowerCase((char) data);
            System.out.println(ch);
        }

        br.close();
    }
}

