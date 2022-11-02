package week7.day3.algorithm.primenumber;

import java.util.ArrayList;
import java.util.List;

public class SieveofEratosthenes {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i < 50; i++) {
            numberList.add(i);
        }

        for (int i = 0; i < numberList.size(); i+=1) {
            if (numberList.get(i) % 2 == 0 && numberList.get(i) != 2) {
                numberList.remove(i);
            }
        }

        numberList.forEach(System.out::println);
    }
}
