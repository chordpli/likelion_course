package week5.day5.programmers.extra;

import java.util.Scanner;
import java.util.Stack;

public class Allbracket {
    boolean solution(String s) {
        Stack<String> word = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(' && s.charAt(i) != ')' && s.charAt(i) != '[' && s.charAt(i) != ']') {
                continue;
            }
            if (s.charAt(i) == '(') {
                word.push("(");
            } else if (s.charAt(i) == '[') {
                word.push("[");
            } else {
                if (word.isEmpty()) {
                    return false;
                }else if (word.peek().equals("(") && s.charAt(i) == ')') {
                    word.pop();
                } else if (word.peek().equals("[") && s.charAt(i) == ']') {
                    word.pop();
                }else{
                    return false;
                }
            }
        }
        return word.isEmpty();
    }

    public static void main(String[] args) {
        Allbracket ab = new Allbracket();
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            input = sc.nextLine();
            if (input.equals(".")) {
                break;
            }
            boolean result = ab.solution(input);
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
