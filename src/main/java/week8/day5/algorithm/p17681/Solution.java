package week8.day5.algorithm.p17681;

import java.util.Arrays;

public class Solution {
    //2진수 계산 로직
    public String toBinary(int a) {
        StringBuilder sb = new StringBuilder();
        while (a > 0) {
            if (a % 2 == 1) {
                sb.insert(0, '1');
            } else {
                sb.insert(0, '0');
            }
            a /= 2;
        }
        addZero(sb);
        return String.valueOf(sb);
    }

    private void addZero(StringBuilder sb) {
        if (sb.length() < 5) {
            for (int i = sb.length(); i < 5; i++) {
                sb.insert(0, '0');
            }
        }
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];


        // arr1을 2진수로 변환
        // arr2를 2진수로 변환
        String[] arr1ToString = new String[arr1.length];
        String[] arr2ToString = new String[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1ToString[i] = toBinary(arr1[i]);
            arr2ToString[i] = toBinary(arr1[i]);
        }

        // 1인 경우에는 #
        // 0인 경우에는 " "을 출력한다.
        for (int i = 0; i < n; i++) {
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < arr1ToString.length; j++) {
                if (arr1ToString[i].charAt(j) == '1' || arr2ToString[i].charAt(j) == '1') {
                    result.append("#");
                } else {
                    result.append(" ");
                }
            }
            answer[i] = String.valueOf(result);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));
    }
}
