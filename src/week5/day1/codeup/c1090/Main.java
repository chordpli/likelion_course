
package week5.day1.codeup.c1090;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        for (int i = 0; i < n-1; i++) {
            a *= r;
        }
        System.out.println(a);
    }
}
