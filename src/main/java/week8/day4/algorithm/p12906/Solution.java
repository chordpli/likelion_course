package week8.day4.algorithm.p12906;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> number = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            inputStack(arr, number, i);
        }
        int[] answer = new int[number.size()];
        for (int i = number.size()-1; i >= 0; i--) {
            answer[i] = number.pop();
        }

        return answer;
    }

    private void inputStack(int[] arr, Stack<Integer> number, int i) {
        if (number.isEmpty()) {
            number.add(arr[i]);
        }else{
            if (!(number.peek() == arr[i])) {
                number.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}