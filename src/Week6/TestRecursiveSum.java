package Week6;

public class TestRecursiveSum {
    //실습 문제 5 : 재귀 호출
    long sum (int num) {
        if (num == 1) { return 1; }
        else { return num + sum(num-1); }
    }

    public static void main(String[] args) {
        TestRecursiveSum sum = new TestRecursiveSum();
        System.out.println(sum.sum(100));
    }
}
