package week3.day3;

import java.util.Random;

public class RandomCalculator {
    private RandomNumberCreator random = new RandomNumberCreator();
    //private int random = (int)(Math.random()*9);

    public void plus(int a) {
        System.out.println(a + random.randomNumberCreator());
    }

    public void minus(int a) {
        System.out.println(a - random.randomNumberCreator());
    }

    public void divide(int a) {
        try{
            float divide = (float) a/ random.randomNumberCreator();
            System.out.println(divide);
        }catch (ArithmeticException e){
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }

    }

    public void multiple(int a) {
        System.out.println(a * random.randomNumberCreator());
    }
}
