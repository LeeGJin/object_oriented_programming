package Week5;

public class Practice9 {
    public static void main(String[] args) {
        //실습문제9 : 배열에서 문자열 검색
        String[] arrS = { "New York", "Beijing", "Seoul" };

        int index = 0;
        boolean find = false;
        for (String str : arrS) {
            if (str.equals("Seoul")) {
                System.out.println("index = " + index + " " + str);
                find = true;
                break;
            }
            index++;
        }
        if (!find) System.out.println("문자열을 찾을 수 없습니다.");
    }
}
