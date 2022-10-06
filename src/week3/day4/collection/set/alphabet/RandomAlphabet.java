package week3.day4.collection.set.alphabet;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();
        Set<Character> alphabet = new HashSet<>();
        for(int i = 0; i < 100; i++){
            alphabet.add(randomAlphabetGenerator.alphabet());
        }

        System.out.println(alphabet);
    }
}
