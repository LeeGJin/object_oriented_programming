package Week3;

public class Practice2 {
    public static void main(String[] args) {
        //실습문제2 : 웹 브라우저 이름을 배열에 저장했다가 화면에 출력
        String[] browsers1 = { "Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale" };
        String[] browsers2 = new String[4];

        browsers2[0] = "Google Chrome";
        browsers2[1] = "Microsoft Edge";
        browsers2[2] = "Mozilla Firefox";
        browsers2[3] = "Naver Whale";

        System.out.printf("출력 대상 : browsers%d\n", 1);
        for(int j = 0; j < 4; j++) {
            System.out.printf("브라우저 이름 : %s, 길이 : %d\n",browsers1[j], browsers1[j].length());
        }
        System.out.printf("출력 대상 : browsers%d\n", 2);
        for(int j = 0; j < 4; j++) {
            System.out.printf("브라우저 이름 : %s, 길이 : %d\n",browsers2[j], browsers2[j].length());
        }
    }
}
