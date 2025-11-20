package Week12.Practice12;

import java.util.HashMap;
import java.util.Map;

/**
 * 실습 문제 12: 문자열에서 단어 세기
 * • 문제
 * – 애드거 앨런 포의 시 “The Bells” 의 일부가 포함된 문자열에서, 3회 이상 나타난 단어 출력
 * • 요구사항
 * – – 맵을 이용해서 단어의 개수를 계산할 것
 * 문자열을 단어 단위로 분리하기 위해 split() 함수를 사용할 것
 */

public class CountWordsInText {
    String[] doc;
    Map<String, Integer> map = new HashMap<>();

    public CountWordsInText (String[] doc) {
        this.doc = doc;
    }

    public void countWords() {
        String delimiters = "(\\,|\\!|\\;|\\.|\\s+)+";

        for (String lines : doc) {
            String[] words = lines.split(delimiters);
            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
    }

    public void printWordsShownMoreThan(int n) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= n) {
                System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String[] doc = {
                "Hear the sledges with the bells",
                "Silver bells!",
                "What a world of merriment their melody foretells!",
                "How they tinkle, tinkle, tinkle,",
                "In the icy air of night!",
                "While the stars, that oversprinkle",
                "All the heavens, seem to twinkle",
                "With  a crystalline delight;",
                "Keeping time, time, time,",
                "In a sort if Runic rhyme,",
                "To the tintinabulation that so musically wells",
                "From the bells, bells, bells, bells,",
                "Bells, bells, bells,",
                "From the jingling and the tinkling of the bells."
        };

        CountWordsInText countWords = new CountWordsInText(doc);
        countWords.countWords();
        countWords.printWordsShownMoreThan(3);
    }
}
