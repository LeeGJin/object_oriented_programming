package Week4;

class Student {
    String name;
    double gpa;
    int incomelevel;

    Student(String name, double gpa, int incomelevel) {
        this.name = name;
        this.gpa = gpa;
        this.incomelevel = incomelevel;
    }

    String getName() { return name;}
    double getGpa() {return gpa;}
    int getIncomelevel() {return incomelevel;}

    boolean checkM() {
        return gpa >= 3.5 && incomelevel <= 5;
    }
}

public class Practice1_4 {
    public static void main(String[] arga) {
        //실습문제 1: 장항생 선발하기
        Student s1 = new Student("김규상", 4.1, 3);
        Student s2 = new Student("김민재", 3.71, 5);
        Student s3 = new Student("김용하", 3.93, 7);

        if (s1.checkM()) {
            System.out.printf("%s 학생은 장학생 후보입니다.\n", s1.getName());
        }
        if (s2.checkM()) {
            System.out.printf("%s 학생은 장학생 후보입니다.\n", s2.getName());
        }
        if (s3.checkM()) {
            System.out.printf("%s 학생은 장학생 후보입니다.\n", s3.getName());
        }
    }
}
