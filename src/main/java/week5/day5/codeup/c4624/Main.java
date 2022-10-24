package week5.day5.codeup.c4624;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = main.returnResult(input);

    }

    public int returnResult(String input) {
        Stack<String> op = new Stack<>();

        int tmp = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == ')') {
                op.push("(");
            } else if (input.charAt(i) == '[' || input.charAt(i) == ']') {
            }
        }
        return 0;
    }
}
