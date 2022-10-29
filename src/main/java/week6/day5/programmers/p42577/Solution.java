package week6.day5.programmers.p42577;

import java.util.*;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> phoneBook = organizePhonebook(phone_book);
        List<String> check = insertList(phoneBook);
        Collections.sort(check);

        for (int i = 0; i < check.size()-1; i++) {
            if(check.get(i+1).startsWith(check.get(i)))
                answer = false;
        }
        return answer;
    }

    public Set<String> organizePhonebook(String[] phoneBook) {
        return new HashSet<>(Arrays.asList(phoneBook));
    }

    public List<String> insertList(Set<String> phonebook) {
        return new ArrayList<>(phonebook);
    }
}
