package week8.day4.algorithm.p12906;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NoStack {
    public List<Integer> solution(int []arr) {
        List<Integer> numberList = new ArrayList<>();

        for (int j : arr) {
            numberList.add(j);
            if (numberList.size() > 1 && Objects.equals(numberList.get(numberList.size() - 1), numberList.get(numberList.size() - 2))) {
                numberList.remove(numberList.size() - 1);
            }
        }

        return numberList;
    }

    public static void main(String[] args) {
        NoStack s = new NoStack();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(s.solution(arr));
    }
}
