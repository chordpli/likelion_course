package week6.day5.programmers.p42577;

import java.util.*;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> phoneBook = organizePhonebook(phone_book);
        List<String> check = insertList(phoneBook);

        for (int i = 0; i < check.size() - 1; i++) {
            String compareWordA = check.get(i);
            for (int j = i + 1; j < check.size(); j++) {
                String compareWordB = check.get(j);
                if (compareWordA.contains(compareWordB) || compareWordB.contains(compareWordA)) {
                    return false;
                }
            }
        }
        return answer;
    }

    public Set<String> organizePhonebook(String[] phoneBook) {
        return new HashSet<>(Arrays.asList(phoneBook));
    }

    public List<String> insertList(Set<String> phonebook) {
        return new ArrayList<>(phonebook);
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        String[] s = {"934793", "34", "44", "9347"};
        System.out.println(p.solution(s));
    }
}
