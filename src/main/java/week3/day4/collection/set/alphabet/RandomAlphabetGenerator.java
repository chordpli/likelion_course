package week3.day4.collection.set.alphabet;

public class RandomAlphabetGenerator implements AlphabetGenerator {
    @Override
    public char alphabet() {
        return (char) ((Math.random() * 26) + 97);
    }
}
