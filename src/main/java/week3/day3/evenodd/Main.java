package week3.day3.evenodd;

public class Main {
    public static void main(String[] args) {
        WordMaker koreanWordMake = new KoreanWordMaker();
        EvenOdd kEvenOdd = new EvenOdd(koreanWordMake);
        EvenOdd eEvenOdd = new EvenOdd(new EnglishWordMaker());

        kEvenOdd.result(5,8);
        eEvenOdd.result(5, 8);
    }
}
