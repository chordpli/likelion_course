package week7.day2.algorithm;

interface StatementStrategy{
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {

    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(17,(a,b) -> a*a <b));
    }
}
