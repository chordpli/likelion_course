package week4.day3.codeup.c4596_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Compare {
    boolean compareValue(int valueA, int valueB);
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.max(arr).get("value"));
        System.out.println(main.max(arr).get("location"));
        sc.close();
    }

    public Map<String, String> getMaxOrMin(int[][] arr, Compare compare) {
        Map<String, String> result = new HashMap<>();
        int targetValue = arr[0][0];
        String targetLocation = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean isCompareValue = compare.compareValue(arr[i][j], targetValue);
                if (isCompareValue) {
                    targetValue = arr[i][j];
                    targetLocation = (i + 1) + " " + (j + 1);
                }
            }
        }
        result.put("location", targetLocation);
        result.put("value", String.valueOf(targetValue));
        return result;
    }

    public Map<String, String> max(int[][] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean compareValue(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public Map<String, String> min(int[][] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean compareValue(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

}
