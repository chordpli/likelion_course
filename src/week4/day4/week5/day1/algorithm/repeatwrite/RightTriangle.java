package week4.day4.week5.day1.algorithm.repeatwrite;

import java.util.Scanner;

public class RightTriangle {

    private String word;

    public RightTriangle(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public static void main(String[] args) {
        /*System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        */
        RightTriangle rt = new RightTriangle("#");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(rt.getWord());
            }
            if (i != count) {
                System.out.println();
            }
        }
    }
}
