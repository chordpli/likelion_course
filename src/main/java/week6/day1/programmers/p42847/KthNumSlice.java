package week6.day1.programmers.p42847;

import java.util.Arrays;

public class KthNumSlice {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands){
            int[] slicedArr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(slicedArr);
            answer[idx++] = slicedArr[command[2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        KthNumSlice kns = new KthNumSlice();


    }
}
