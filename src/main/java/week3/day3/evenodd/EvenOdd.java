package week3.day3.evenodd;

public class EvenOdd {
    private WordMaker wordMaker;

    public EvenOdd(WordMaker wordMaker) {
        this.wordMaker = wordMaker;
    }

    public void result(int a, int b){
        System.out.println(wordMaker.getWord(a) + " + " + wordMaker.getWord(b) + " = " + wordMaker.getWord(a+b)) ;
    }
}
