package week5.day5.programmers.p12909;

import week5.day4.programmers.p12912.Solution;

import java.util.Stack;

public class SolveBracket {
    boolean solution(String s) {
        Stack<String> word = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                word.push("(");
            } else {
                if (s.charAt(i) == ')' && !word.isEmpty()) {
                    word.pop();
                } else {
                    return false;
                }
            }
        }
        if (word.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }

}
