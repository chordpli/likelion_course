package week5.day2.codeup.c1096;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[20][20];
        int n = sc.nextInt();
        int a, b;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            board[a][b] = 1;
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}