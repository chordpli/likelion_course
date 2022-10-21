package week3.day3.calculator3;

public class ByPassNumberGenerator implements NumberGenerator {
    @Override
    public int create(int num) { //두 번째 따라하기
        return num;
    }
}