package week3.day3.evenodd;

public class KoreanWordMaker implements WordMaker {
    @Override
    public String getWord(int a) {
        if (a % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }
}
