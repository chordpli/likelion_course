package week11.day1.combination;

public class RecursionAlphabet3 {

    public static void main(String[] args) {
        int n = 2;
        printRecursionAlphabet(2, "");
    }

    public static void printRecursionAlphabet(int depth, String prefix) {
        if (prefix.length() > depth) return;
        System.out.println(prefix);

        for (char c = 'A'; c <= 'Z'; c++) {
            printRecursionAlphabet(depth, prefix + c);
        }
    }
}
