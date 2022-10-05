package week3.day3.calculator2;

public class RandomCalculator {
    private int randomTo;
    private NumberCreator random;

    //private int random = (int)(Math.random()*9);

    public RandomCalculator(NumberCreator random) {
        this.randomTo = random.randomNumberCreator();
    }

    public void plus(int a) {
        System.out.println(a + randomTo);
    }

    public void minus(int a) {
        System.out.println(a - randomTo);
    }

    public void divide(int a) {
        try {
            float divide = (float) a / randomTo;
            System.out.println(divide);
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
    }

    public void multiple(int a) {
        System.out.println(a * randomTo);
    }
}
