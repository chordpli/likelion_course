package week8.day2.algorithm.c3001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(sc.next());
        }

        int targetNumber = sc.nextInt();


        int findNumber = -1;

        for (int i = 0; i <n; i++) {
            if (number[i] == targetNumber) {
                findNumber = i+1;
                break;
            }
        }
        System.out.println(findNumber);
    }
}
