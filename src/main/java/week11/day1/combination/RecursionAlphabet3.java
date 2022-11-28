package week11.day1.combination;

public class RecursionAlphabet3 {

    public static void main(String[] args) {
        int n = 2;
        printRecursionAlphabet(2, "");
    }

    public static void printRecursionAlphabet(int n, String prefix) {
        if (prefix.length() > n) return;
        System.out.println(prefix);

        for (char c = 'A'; c <= 'Z'; c++) {
            printRecursionAlphabet(n, prefix + c);
        }
    }
}
