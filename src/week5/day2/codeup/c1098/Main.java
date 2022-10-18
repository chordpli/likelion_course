package week5.day2.codeup.c1098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = sc.nextInt();
        int n = sc.nextInt();

        int[][] board = new int[h][w];
        for (int i = 1; i <= n; i++) {
            int l = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int y = sc.nextInt();
            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    board[x-1][j + y-1] = 1;
                } else if (d == 1){
                    board[j + x-1][y-1] = 1;
                }

            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
