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
        return String.valueOf(sb);
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];


        // arr1을 2진수로 변환
        String[] arr1ToString = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1ToString[i] = Integer.toBinaryString(arr1[i]);
            addZero(arr1ToString, i);
        }
        // arr2를 2진수로 변환
        String[] arr2ToString = new String[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2ToString[i] = Integer.toBinaryString(arr2[i]);
            addZero(arr2ToString, i);
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

    private void addZero(String[] arr1ToString, int i) {

        if (arr1ToString[i].length() < 5) {
            for (int j = arr1ToString.length; j <= 5; j++) {
                arr1ToString[i] += "0" + arr1ToString[i];
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(s.toBinary(13));
    }
}
