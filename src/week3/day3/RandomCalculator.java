package week3.day3;

public class RandomCalculator {
    private RandomNumberCreator random = new RandomNumberCreator();
    private int randomNumber;
    //private int random = (int)(Math.random()*9);

    public RandomCalculator() {
        this.randomNumber = random.randomNumberCreator();
    }

    public void plus(int a) {
        System.out.println(a + randomNumber);
    }

    public void minus(int a) {
        System.out.println(a - randomNumber);
    }

    public void divide(int a) {
        try {
            float divide = (float) a / randomNumber;
            System.out.println(divide);
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
    }

    public void multiple(int a) {
        System.out.println(a * randomNumber);
    }
}
