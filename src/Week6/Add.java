package Week6;

public class Add {
    //실습 문제 4 : int, double, String 형 인자 두 개를 전달 받아 함 또는 연결된 문자열 반환
    String add (String s1, String s2) {
        return s1 + ' ' + s2;
    }
    int add (int n1, int n2) {
        return n1 + n2;
    }
    double add (double d1, double d2) {
        return d1 + d2;
    }

    public static void main(String[] args) {
        Add a = new Add();
        String newStr = a.add("hello", "world");
        int sumInt = a.add(5, 3);
        double sumDouble = a.add(5.1, 3.5);
        System.out.printf("newStr = %s\n", newStr);
        System.out.printf("sumInt = %d\n", sumInt);
        System.out.printf("sumDouble = %f\n", sumDouble);
    }
}
