package Week3;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcdef";

        //문자열 길이 출력
        System.out.printf("\"abc\"의 길이 : %d\n", s1.length());
        System.out.printf("\"abcdef\"의 길이 : %d\n", s2.length());

        //특정 위치의 문자 반환
        System.out.printf("\"abc\"의 두 번째 글자 : %c\n", s1.charAt(1));
        System.out.printf("\"abcdef\"의 세 번째 글자 : %c\n", s1.charAt(2));

        //문자열 비교
        System.out.printf("\"abc\"와 \"abcdef\"를 비교하는 equals() 함수의 결과 : %s\n", s1.equals(s2));
        System.out.printf("\"abc\"와 \"abcdef\"의 compareTo() 결과 : %s\n", s1.compareTo(s2));
        System.out.printf("\"abc\"와 \"ABC\"의 compareToIgnoreCase() 결과 : %d\n", s1.compareToIgnoreCase("ABC"));
        s1.contains("ab");
        s2.indexOf(s1);

        //문자열 추출
        String fileName = "java.jpg";
        fileName.endsWith(".jpg");
        fileName.endsWith(".png");
        fileName.substring(5);
        fileName.substring(0, 4);

        //앞 뒤 공백문자 제거
        String s4 = "         new string   \t";
        String trimmedString = s4.trim();
        System.out.println(trimmedString);
    }
}
