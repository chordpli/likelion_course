package week6.day5.programmers.p42577;

import java.util.*;

public class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> phoneBook = organizePhonebook(phone_book);

        String temp = null;
        for (String phone : phoneBook) {
            if (temp != null) {
                if (phone.startsWith(temp)) {
                    answer = false;
                }
            }
            temp = phone;
        }
        return answer;
    }
    public Set<String> organizePhonebook(String[] phoneBook) {
        return new TreeSet<>(Arrays.asList(phoneBook));
    }
}
