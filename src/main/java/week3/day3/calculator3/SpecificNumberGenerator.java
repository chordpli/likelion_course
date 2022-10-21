package week3.day3.calculator3;

public class SpecificNumberGenerator implements NumberGenerator {

    @Override
    public int create(int num) {
        return 320 * num;
    }
}
