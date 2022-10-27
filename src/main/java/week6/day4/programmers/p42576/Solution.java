package week6.day4.programmers.p42576;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> result = new HashMap<>();
        String check = null;

        // 참여한 사람들을 Map에 입력하여 value 값을 추가한다.
        for (String p : participant) {
            result.put(p, result.getOrDefault(p, 0) + 1);
        }

        // 완주한 사람들을 Map에 입력하면 value값을 감소시킨다.
        for (String c : completion) {
            result.put(c, result.get(c) - 1);
        }

        // 값이 0이 아닌 사람을 체크 한다. 참여는 했으나 완주하지 못했다면
        // value 값은 1이 남아 있을 것.
        for (String key : result.keySet()) {
            if (result.get(key) != 0 ) {
                check = key;
                break;
            }
        }
        return check;
    }
}