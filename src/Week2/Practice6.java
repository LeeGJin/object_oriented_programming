package Week2;

public class Practice6 {
    public static void main(String[] args) {
        //실습문제6, 7 : 배열 사용
        double arr1[] = {1.1, 2.3, 4.7, 7.5};
        double arr2[] = new double[4];
        arr2[0] = 1.1;
        arr2[1] = 2.3;
        arr2[2] = 4.7;
        arr2[3] = 7.5;
        System.out.printf("각 배열의 크기 : arr1 : %d, arr2 : %d\n", arr1.length, arr2.length);
        for(int i = 0; i < 4; i++) {
            System.out.printf("arr1[%d] = %.1f, arr2[%d] = %.1f\n", i, arr1[i], i, arr2[i]);
        }
    }
}
