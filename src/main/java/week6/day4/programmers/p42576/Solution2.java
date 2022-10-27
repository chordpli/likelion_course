package week6.day4.programmers.p42576;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.merge(key, 1, Integer::sum);

        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i]; // value 1
            memo.put(key, memo.get(key) - 1);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }
}
