package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] intArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] intArrays2 = new int[10];
        List<Integer> intarr = new ArrayList<>();
        for(int i = 0; i <= 9; i++){
            intArrays2[i] = i+1;
        }

        for(int i : intArrays2){
            System.out.print(i + " ");
        }

    }
}
