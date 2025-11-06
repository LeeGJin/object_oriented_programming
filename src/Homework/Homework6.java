package Homework;

/**
 * 7-1장 개념 확인 과제
 * 문제
 * – code와 name을 멤버 변수로 가지는 Course 클래스를 만든 후,
 *   이를 상속받는 OnlineCourse 클래스와 OfflineCourse 클래스를 설계
 * – OnlineCourse 클래스와 OfflineCourse 클래스는
 *   toString() 함수를 오버라이딩하여 아래 형식의 문자열을 반환
 *   OnlineCourse: "Code: " + code + ", Name: " + name + ", Type: Online“
 *   OfflineCourse: "Code: " + code + ", Name: " + name + ", Type: Offline“
 *
 * 요구 사항
 * – Homework6.java 파일에 아래 Homework6 클래스를 포함
 */

class Course {
        private String code;
    private String name;

    public Course (String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getName() {return name;}
    public String getCode() {return code;}
}

class OnlineCourse extends Course {
    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + getCode() + ", Name: " + getName() + ", Type: Online";
    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + getCode() + ", Name: " + getName() + ", Type: Offline";
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}
