package week5.day2.codeup.c1099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] road = new int[10][10];

        for (int i = 0; i <road.length ; i++) {
            for (int j = 0; j < road[i].length; j++) {
                road[i][j] = sc.nextInt();
            }
        }

        Main main = new Main();
        road = main.bfs(2, 2);
    }

    public int[][] bfs(int a, int b) {

        return;
    }
}
