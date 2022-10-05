package week3.day3;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator userDao = new Calculator();
        userDao.plus(3,5);
        userDao.minus(3,5);
        userDao.divide(3,5);
        userDao.multiple(3,5);
    }
}
