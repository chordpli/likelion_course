package week7.day2.algorithm;

public class PrimeNumber {

    public boolean firstMethod(int number) {
        int remainder = 1;

        for (int i = 2; i < number; i++) {
            remainder = number % i;
            if (remainder == 0) {
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
