package week4.day3.algorithm;

public class Max04 {

    public int getMax(int[] arr) {
        int maxValue = arr[0];
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
