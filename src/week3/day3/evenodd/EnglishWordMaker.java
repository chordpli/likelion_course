package week3.day3.evenodd;

public class EnglishWordMaker implements WordMaker {
    @Override
    public String getWord(int a) {
        if (a % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
