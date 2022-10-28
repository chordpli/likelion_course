package week6.day5.programmers.p1845;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = nums.length / 2;
        for (int num : nums) {
            set.add(num);
        }

        if (set.size() > count) {
            return count;
        } else {
            return set.size();
        }
    }
}
