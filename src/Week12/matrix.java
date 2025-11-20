package Week12;

public class matrix {
    public static void main(String[] args) {
        int[][] marks = { { 50, 60, 55, 67, 70 },
                        { 62, 65, 70, 70, 81 },
                        { 72, 66, 77, 80, 69 } };

        System.out.println("for문을 이용한 행렬 출력");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.printf("%d ", marks[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\n향상된 for문을 이용한 행렬 출력");
        for (int[] mArr : marks) {
            for (int m : mArr) {
                System.out.printf("%d ", m);
            }
            System.out.println("");
        }

        System.out.println("\n패러렐 배열 (Parallel Array)");
        String[] names = {"SBS", "KBS2", "KBS1", "EBS1", "MBC"};
        int[] channels = { 6, 7, 9, 10, 11};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("television networks: %s, channel number: %d\n", names[i], channels[i]);
        }

    }
}
