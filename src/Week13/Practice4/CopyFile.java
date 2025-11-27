package Week13.Practice4;

import java.io.*;

/**
 * 실습 문제 4 : 파일 복사하기
 * • 문제
 * – "hello.txt"를 복사해서 "hello2.txt"를 만들기
 * • 요구사항
 * – "hello.txt"와 "hello2.txt"는 같은 폴더에 있음
 * – InputStream과 OutputStream을 매개 변수로 취하는 파일 복사 함수를 구현할 것
 * – 복사 이후에, 복사가 제대로 되었는지 확인하기 위해
 * hello2.txt 파일을 읽어 이 내용을 화면에 출력하는 코드 포함
 */

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("hello.txt");
        FileOutputStream fo = new FileOutputStream("hello2.txt");

        int data;
        while ((data = fi.read()) != -1) {
            fo.write(data);
        }

        fi.close();
        fo.close();

        BufferedReader br = new BufferedReader(new FileReader("hello2.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
