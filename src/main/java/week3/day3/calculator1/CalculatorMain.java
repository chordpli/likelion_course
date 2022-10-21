package week3.day3.calculator1;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(4, 6);
        calculator.plus();
        calculator.minus();
        calculator.divide(3,5);
        calculator.multiple(3,5);
    }
}
