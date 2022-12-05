package week11.day3.tree.c1936;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(goUp(sc.nextInt(), sc.nextInt()));
    }

    public static int goUp(int a, int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1;  // a를 부모 쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1;  // b를 부보 쪽으로
        } else {  // a== b
            return 0;
        }
    }
}
