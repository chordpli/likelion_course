package week3.day3.calculator3;

public class SpecificNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        return 2000 * num;
    }
}
