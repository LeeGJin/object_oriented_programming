package Week13.Practice5;

import java.io.*;

/**
 * 실습 문제 5
 * • 문제
 * – 파일에 다음 내용을 저장
 * – 파일 이름은 "travel.txt"로 지정하고
 * 들여쓰기 부분은 탭 문자를 이용
 * I love to travel.
 * The cities I have visited:
 * - Seoul
 * - New York
 * - Sydney
 * • 요구사항
 * – BufferedWriter를 사용할 것
 */

public class TestBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("travel.txt"));

        bw.write("I love to travel.\r\n");
        bw.write("The cities I have visited:\r\n");
        bw.write("\t- Seoul\r\n");
        bw.write("\t- New York\r\n");
        bw.write("\t- Sydney\r\n");

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("travel.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
