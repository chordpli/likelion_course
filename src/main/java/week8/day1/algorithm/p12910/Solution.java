package week8.day1.algorithm.p12910;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        // divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환.
        // 떨어지는 숫자가 없으면 -1 반환

        Set<Integer> collectNumber = initTreeSet(arr, divisor);
        Integer[] answer = collectNumber.toArray(new Integer[0]);
        if (answer.length == 0) {
            return new Integer[]{-1};
        }
        return answer;
    }

    public Set<Integer> initTreeSet(int[] arr, int divisor) {
        Set<Integer> divideSet = new TreeSet<>();

        for (int num : arr) {
            if (checkDivide(num, divisor)) {
                divideSet.add(num);
            }
        }
        return divideSet;
    }

    // 나누어 떨어지는지 확인
    public boolean checkDivide(int num, int divisor) {
        return num % divisor == 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3,2,6};
        System.out.println(Arrays.toString(s.solution(arr, 5)));
    }
}
