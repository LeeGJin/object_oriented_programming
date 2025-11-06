package Week9.Practice1;

//싷습문제1 : 수강신청 프로그램 작성

public class TestCourse {
    public static void main (String[] args) {
        Lecturer lecturer = new Lecturer("김갑돌", "G411", "bkim3234829@su.ac.kr");
        Course oo1 = new Course(lecturer, "G412");
        Student s1 = new Student("202011111", "jsl");
        Student s2 = new Student("202011112", "bdk");
        Student s3 = new Student("202011113", "cho");
        oo1.enroll(s1);
        System.out.printf("Num of enrolled Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s2);
        System.out.printf("Num of enrolled Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s3);
        System.out.printf("Num of enrolled Students: %d\n", oo1.getNumEnrolled());
        oo1.drop(s2);
        System.out.printf("Num of enrolled Students: %d\n", oo1.getNumEnrolled());
        oo1.printEnrolled();
    }
}

