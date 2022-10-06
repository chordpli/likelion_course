package week3.day4.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> deduplication = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            deduplication.add(randomNumberGenerator.generate(10));
        }

        for (Integer i : deduplication) {
            System.out.println(i);
        }
    }
}
