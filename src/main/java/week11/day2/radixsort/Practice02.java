package week11.day2.radixsort;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Practice02 {
    public static void main(String[] args) {
        int[] inputArr = {2, 8, 18, 13, 1, 7, 16, 7, 0, 14, 202, 222};

        Queue<Integer>[] queueArr = new Queue[10];

        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        for (int i : inputArr) {
            queueArr[i % 10].add(i);
        }

        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while (!queueArr[i].isEmpty()) {
                inputArr[idx++] = queueArr[i].poll();
            }
        }

        System.out.println(Arrays.toString(inputArr));
    }

    private static int[] sort(int[] inputArr) {
        int[] arr = new int[Arrays.stream(inputArr).max().getAsInt() + 1];
        Arrays.fill(arr, -1);

        for (int i : inputArr) {
            arr[i] = i;
        }
        return arr;
    }
}
