package Week9.Practice1;

//싷습문제1 : 수강신청 프로그램 작성 (수정)

public class Course {
    private final static int MAX_STUDENTS = 30;
    private Lecturer lecturer;
    private String room;
    private Book ref;
    private int numEnrolled = 0;
    private Student[] students = new Student[MAX_STUDENTS];

    public Course(Lecturer lecture, String room) {
        this.lecturer = lecture;
        this.room = room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public void setBook(Book r) { this.ref = r;}

    public void enroll(Student s) {
        if (numEnrolled < MAX_STUDENTS) {
            students[numEnrolled++] = s;
        }
    }

    public void drop(Student s) {
        if (numEnrolled > 0) {
            for (int i = 0; i < numEnrolled; i++) {
                if (students[i].equals(s)) {
                    for (int j = i + 1; j < students.length; j++) {
                        students[j-1] = students[j];
                    }
                    numEnrolled--;
                    break;
                }
            }
        }
    }

    public int getNumEnrolled() {
        return numEnrolled;
    }

    public void printEnrolled() {
        for (int i = 0; i < numEnrolled; i++) {
            System.out.println(students[i]);
        }
    }
}
