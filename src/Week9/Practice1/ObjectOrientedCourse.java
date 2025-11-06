package Week9.Practice1;

//싷습문제1 : 수강신청 프로그램 작성

public class ObjectOrientedCourse {
    private final static int MAX_STUDENTS = 30;
    private String lecturer, room;
    private int numEnrolled = 0;
    private String[] students = new String[MAX_STUDENTS];

    public ObjectOrientedCourse(String lecture, String room) {
        this.lecturer = lecture;
        this.room = room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void enroll(String s) {
        if (numEnrolled < MAX_STUDENTS) {
            students[numEnrolled++] = s;
        }
    }

    public void drop(String s) {
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
