package Week12.Practice8;

import java.util.HashMap;
import java.util.Map;

/**
 * 실습 문제 8: 문자열에서 문자 세기
 * • 문제
 * – 영문 문자열을 입력 받고, 문자열에 있는 알파벳 문자별로 개수를 화면에 출력하는 프로그램 작성
 * – 문자열에 존재하지 않는 알파벳 문자는 출력 안함
 * • 요구사항
 * – 맵을 이용해서 문자의 개수를 계산할 것
 * – String 클래스의 toCharArray() 함수를 이용해서 문자열을 문자 배열로 만든 후에 각 문자별 개수를 셀 것
 */

public class TestCountChar {
    private String s;

    public TestCountChar (String s) {
        this.s = s;
    }

    public Map<Character, Integer> countChars() {
        Map<Character, Integer> map = new HashMap<>();
        char[] letters = s.toCharArray();
        for (char c : letters) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        TestCountChar tcc = new TestCountChar( "sangmyung university" );
        Map<Character, Integer> map = tcc.countChars();
        System.out.println(map);
    }
}
