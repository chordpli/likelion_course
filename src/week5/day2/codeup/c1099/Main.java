package week5.day2.codeup.c1099;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int[][] road = new int[10][10];

        for (int i = 0; i < road.length; i++) {
            for (int j = 0; j < road[i].length; j++) {
                road[i][j] = sc.nextInt();
            }
        }
        road = main.bfs(road, 1, 1);
        for (int i = 0; i < road.length; i++) {
            for (int j = 0; j < road[i].length; j++) {
                System.out.print(road[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] bfs(int[][] road, int a, int b) {
        if (road[a][b] == 2) {
            road[a][b] = 9;
            return road;
        }else{
            road[a][b] = 9;
        }

        if (road[a][b + 1] == 0 || road[a][b + 1] == 2) {
            if(road[a][b + 1] == 2){
                road[a][b + 1] = 9;
                return road;
            }else{
                road[a][b + 1] = 9;
                return bfs(road, a, b + 1);
            }
        } else if (road[a + 1][b] == 0 || road[a + 1][b] == 2) {
            if(road[a][b + 1] == 2){
                road[a + 1][b] = 9;
                return road;
            }else{
                return bfs(road, a + 1, b);
            }
        } else if (a == 8 && b == 8) {
            road[a][b] = 9;
            return road;
        }
        return road;
    }
}
