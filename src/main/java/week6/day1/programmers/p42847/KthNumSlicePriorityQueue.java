package week6.day1.programmers.p42847;

import java.util.PriorityQueue;

public class KthNumSlicePriorityQueue {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(array, commands[i]);
        }

        return answer;
    }

    public int getKthNum(int[] arr, int[] command) {
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];

        int result = 0; // 문제에 0이 안나옴.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = frIdx - 1; i < toIdx; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        KthNumSlicePriorityQueue kns = new KthNumSlicePriorityQueue();


    }
}
