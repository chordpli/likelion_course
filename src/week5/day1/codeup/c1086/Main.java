package week5.day1.codeup.c1086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double pixelA = Double.parseDouble(st.nextToken());
        double pixelB = Double.parseDouble(st.nextToken());
        double bit = Double.parseDouble(st.nextToken());
        double result = (double) (pixelA * pixelB * bit) / 8 / 1048576;

        System.out.printf("%.2f MB", result);

    }
}