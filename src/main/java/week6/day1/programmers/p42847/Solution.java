package week6.day1.programmers.p42847;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // 1. i ~ j 자르기
            int[] splitArr = splice(array, commands[i][0] - 1, commands[i][1]);

            // 2. 정렬
            splitArr = sort(splitArr);

            // 3. k번째 숫자 더하기
            answer[i] = splitArr[commands[i][2]-1];
        }
        return answer;
    }

    public int[] splice(int[] array, int i, int j) {
        int[] result = new int[j - i];
        for (int k = 0; k < result.length; k++) {
            result[k] = array[i];
            i++;
        }
        return result;
    }

    public int[] sort(int[] arr) {
        int idx;
        for (int i = 1; i < arr.length; i++) {
            idx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                    i--;
                } else {
                    break;
                }
            }
            i = idx;
        }
        return arr;
    }

    public int[] swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = s.solution(arr, commands);
        System.out.println(Arrays.toString(result));
    }
}
