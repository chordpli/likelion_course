package week3.day3.calculator3;

public class Main {
    public static void main(String[] args) {
        /* SOLID중 LSP 리스코프 치환 원칙 (Liskov Substitution Principle)
         * RandomNumberGenerator <-> SpecificNumberGenerator를 바꿔줌으로서 원하는 기능을 바로 바꿀 수 있다.
         */
        NumberGenerator numberGenerator = new RandomNumberGenerator(); // SOLID중 L에 해당하는 부분

        Calculator randomNumberCalculator = new Calculator(numberGenerator);
        Calculator specificNumberCalculator = new Calculator(new SpecificNumberGenerator());
        randomNumberCalculator.plus();

    }
}
