package week5.day1.codeup.c1084;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <b ; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.printf("%d %d %d\n",i,j,k);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

