package Week9.Practice1;

//싷습문제1 : 수강신청 프로그램 작성

public class Student {
    private String stNo;
    private String name;

    public Student(String stNo, String name) {
        this.stNo = stNo;
        this.name = name;
    }
    public String getStNo() {
        return stNo;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Name: " + name + ", Student Number: " + stNo;
    }
}
