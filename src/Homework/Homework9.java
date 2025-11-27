package Homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 9, 10장 개념 확인 과제
 * • 문제
 * – Homework8.java과 같이, ID와 비밀번호 쌍을 해시맵에 저장하고, 이를 이용하여 로그인 기능을 구현
 * – 단, db.txt 파일로부터 ID와 비밀번호 쌍을 입력받음
 * • 요구사항
 * – 입력된 ID가 존재하지 않으면 다시 입력하라는 메시지 출력
 * – 입력된 ID가 존재하면, 비밀번호를 입력받고 일치 여부 확인
 * – ID와 비밀번호 뒤에 입력된 공백은 무시 (String 클래스의 trim() 함수 사용)
 * – db.txt에 저장된 ID와 비밀번호 쌍은 아래와 같으며, 상대경로 사용
 */

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                String[] IdPassword = line.split("\\s+");
                map.put(IdPassword[0], IdPassword[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

        String id, password;
        do {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = sc.nextLine().trim();
            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            password = sc.nextLine().trim();
            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        } while (true);
    }
}
