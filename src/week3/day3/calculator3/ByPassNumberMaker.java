package week3.day3.calculator3;

public class ByPassNumberMaker implements NumberGenerator{

    @Override
    public int generate(int num) {
        return num;
    }

    @Override
    public int create(int num) { //두 번째 따라하기
        return num; 
    }

}
