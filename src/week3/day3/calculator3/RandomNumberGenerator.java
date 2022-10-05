package week3.day3.calculator3;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int create(int num) {
        return (int)(Math.random() * num);
    }
}
