package week10.day2.algorithm.recursion.c1912;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println(main.factorial(sc.nextInt(), 1));

    }

    public int factorial(int num, int mul) {
        if(num == 0 ) return mul;
        return factorial(num-1, (mul * num));
    }
}
