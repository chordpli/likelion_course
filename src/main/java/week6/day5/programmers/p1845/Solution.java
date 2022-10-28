package week6.day5.programmers.p1845;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        int N = nums.length / 2;
        if (set.size() < N) {
            return set.size();
        }else{
            return N;
        }
    }

}
