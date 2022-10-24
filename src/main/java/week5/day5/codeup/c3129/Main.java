package week5.day5.codeup.c3129;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean result = main.returnResult(input);

        System.out.println(result == true ? "good" : "bad");
    }

    public boolean returnResult(String input) {
        Stack<String> bracket = new Stack<>();

        if (input.charAt(0) == ')') {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                bracket.push("(");
            } else if (input.charAt(i) == ')' && bracket.size() > 0) {
                bracket.pop();
            }
        }

        if (bracket.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}
