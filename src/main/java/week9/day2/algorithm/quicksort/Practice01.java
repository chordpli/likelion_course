package week9.day2.algorithm.quicksort;

import java.util.ArrayList;
import java.util.List;

public class Practice01 {

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

        // 1. 기준값 뽑는 로직 구현
        int pivot = arr[arr.length / 2];
        System.out.println(pivot);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {
            if(pivot > arr[i]){
                left.add(arr[i]);
            } else if (pivot < arr[i]) {
                right.add(arr[i]);
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}
