package week5.day2.codeup.c1097;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[20][20];
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        int a, b;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = 1; j < board.length ; j++) {
                if(board[a][j] == 0){
                    board[a][j] = 1;
                }else{
                    board[a][j] = 0;
                }
            }
            for (int j = 1; j < board.length ; j++) {
                if(board[j][b] == 0){
                    board[j][b] = 1;
                }else{
                    board[j][b] = 0;
                }
            }
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
