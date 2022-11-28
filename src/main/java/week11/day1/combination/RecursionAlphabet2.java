package week11.day1.combination;

public class RecursionAlphabet2 {

    public static void main(String[] args) {
        printRecursionAlphabet("");
    }

    public static void printRecursionAlphabet(String prefix) {
        if (prefix.length() > 3) return;
        System.out.println(prefix);

        for (char c = 'A'; c <= 'Z'; c++) {
            printRecursionAlphabet(prefix + c);
        }
    }
}
