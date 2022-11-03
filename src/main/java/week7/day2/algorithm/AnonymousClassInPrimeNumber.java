package week7.day2.algorithm;

interface Strategy{
    boolean compare(int a, int b);
}

public class AnonymousClassInPrimeNumber {
    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            System.out.println(i);
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        AnonymousClassInPrimeNumber acip = new AnonymousClassInPrimeNumber();
        boolean r = acip.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a <= b;
            }
        });
        System.out.println(r);
    }
}
