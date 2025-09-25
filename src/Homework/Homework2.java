package Homework;

import java.util.Scanner;

/** 3장 개념 확인 과제
 * 문제
 * - Student 클래스를 코드로 구현하세요. 이 클래스는 학번, 이름, 전공, 전화번호를 속성으로 가지고, 메소드로는 각 멤버 변수의 값을 읽는 getter와 설정하는 setter를 구현합니다
 *   (예: setMajor(), getMajor())
 * - 3명의 학생 정보를 키보드로부터 입력받아 Student 객체를 생성하고, 입력이 끝나면 입력된 학생 정보를 모두 출력하는 Homework2 클래스를 작성하세요.
 * - 파일명은 Homework2.java로 지정하여 github에 업로드
 *
 * 요구사항
 * - 학번, 이름, 전공, 전화번호 순서로, 띄어쓰기로 구분하여 학생 정보 입력
 * - 전공과 이름은 문자열로, 학번과 전화번호는 숫자로 저장 (즉, 전화번호 입력시 '-'가 없고, 맨 앞 0은 삭제)
 *   다만 전화번호는 출력시 010-xxxx-xxxx 형태로 앞자리 0을 복구하고 중간 중간 하이픈('-')을 삽입
 */

class Student {
    int id;
    long phone;
    String major, name;

    Student(int id, String name, String major, long phone) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    void setId(int id) {this.id = id;}
    void setName(String name) {this.name = name;}
    void setMajor(String major) {this.major = major;}
    void setPhone(long phone) {this.phone = phone;}

    int getId() {return id;}
    String getName() {return name;}
    String getMajor() {return major;}
    String getPhone() {
        String sPhone = String.valueOf(phone);
        sPhone = "0" + sPhone;
        return sPhone.substring(0, 3) + "-" + sPhone.substring(3, 7) + "-" + sPhone.substring(7);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] line;
        Student[] sArr = new Student[3];
        int id;
        long phone;
        String major, name;
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요 : ");
            line = sc.nextLine().split(" ");
            id = Integer.parseInt(line[0]);
            name = line[1];
            major = line[2];
            phone = Long.parseLong(line[3]);
            sArr[i] = new Student(id, name, major, phone);
        }

        String[] words = { "첫", "두", "세" };
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.println(words[i] + "번째 학생 : " + sArr[i].getId() + " " + sArr[i].getName() +
                    " " + sArr[i].getMajor() + " " + sArr[i].getPhone());
        }
    }
}
