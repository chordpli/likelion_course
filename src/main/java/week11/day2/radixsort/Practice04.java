package week11.day2.radixsort;

import java.util.*;

public class Practice04 {
    private static int[] getDigit(int[] inputArr) {
        Set<Integer> digit = new TreeSet<>();
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 0) {
                digit.add(1);
                continue;
            }
            digit.add((int) (Math.log10(inputArr[i]) + 1));
        }

        int[] answer = new int[digit.size()];
        int idx = 0;
        for (Integer n : digit) {
            answer[idx++] = n;
        }
        return  answer;
    }

    private static int[] sort(int[] arr, int digit) {
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int divisor = (int) Math.pow(10, digit-1);
            queueArr[Math.floorDiv(arr[i], digit) % 10].add(arr[i]);
        }

        int[] answer = new int[arr.length];
        int idx = 0;
        for (int i = 0; i <queueArr.length ; i++) {
            while (!queueArr[i].isEmpty()) {
                arr[idx++] = queueArr[i].poll();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] inputArr = {2, 8, 18, 13, 1, 7, 16, 7, 0, 14, 202, 222};
        int[] digits = getDigit(inputArr);
        for (var digit : digits) {
            inputArr = sort(inputArr, digit);
            System.out.println(Arrays.toString(inputArr));
        }
    }
}
