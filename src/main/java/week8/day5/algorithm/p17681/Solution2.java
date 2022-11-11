package week8.day5.algorithm.p17681;

import java.util.Arrays;

public class Solution2 {
    //2진수 계산 로직

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        // arr1, arr2를 2진수로 변환
        String[] arrToBinary = new String[n];
        for (int i = 0; i < n; i++) {
            arrToBinary[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            for (int j = arrToBinary[i].length(); j < n ; j++) {
                arrToBinary[i] = "0" + arrToBinary[i];
            }
        }

        // 1인 경우에는 #, 0인 경우에는 " "을 출력한다.
        for (int i = 0; i < n; i++) {
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (arrToBinary[i].charAt(j) == '1') {
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
        Solution2 s = new Solution2();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        int n2 = 6;
        int[] arr3 = {46, 33, 33 ,22, 31, 50};
        int[] arr4 = {27 ,56, 19, 14, 14, 10};

        System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));
        System.out.println(Arrays.toString(s.solution(n2, arr3, arr4)));
    }
}
