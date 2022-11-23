package week10.day2.algorithm.recursion.c1855;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(main.fibonacci(sc.nextInt()));
    }

    public int fibonacci (int n){
        if(n <= 2) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
