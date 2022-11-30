package week9.day2.algorithm.quicksort;

import java.util.ArrayList;
import java.util.List;

public class Practice01 {

    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(left);
        return answer;
    }

    public List<Integer> sort(List<Integer> arr) {
        // 1. 기준값 뽑는 로직 구현
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(arr.size() / 2);
        System.out.println(pivot);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();


        for (int i = 0; i < arr.size(); i++) {
            if (pivot > arr.get(i)) {
                left.add(arr.get(i));
            } else if (pivot < arr.get(i)) {
                right.add(arr.get(i));
            } else {
                mid.add(arr.get(i));
            }
        }

        System.out.println(left);
        System.out.println(right);

        return merge(sort(left), mid, sort(right));
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50}; // size = 8
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        Practice01 qs = new Practice01();
        al = qs.sort(al);

        System.out.println("정렬" + al);
    }
}
