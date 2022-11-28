package week11.day1.combination;

public class RecursionAlphabet {
    public static void main(String[] args) {
        printRecursionAlphabet('A', "AA");
    }

    public static void printRecursionAlphabet(char c, String prefix) {
        if(c>'Z') return;
        System.out.println(prefix + c);
        printRecursionAlphabet((char) (c+1), prefix);
    }
}
