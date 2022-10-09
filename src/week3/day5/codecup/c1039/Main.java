package week3.day5.codecup.c1039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        StringTokenizer st = new StringTokenizer(number);
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println(a + b);
        br.close();
    }
}
