package week7.day2.algorithm;

public class PrimeNumber {

    public boolean firstMethod(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean secondMethod(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean thirdMethod(int number) {
        for (int i = 2; i*i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        System.out.println(p.firstMethod(13));
        System.out.println(p.firstMethod(17));
        System.out.println(p.firstMethod(19));
        System.out.println(p.firstMethod(23));
    }
}
