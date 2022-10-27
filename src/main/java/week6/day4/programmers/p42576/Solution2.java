package week6.day4.programmers.p42576;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        String answer = "";
        for (String key : participant) {
            memo.merge(key, 1, Integer::sum);
        }

        // value 1
        for (String key : completion) {
            memo.merge(key, -1, Integer::sum);
        }

        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }
}
