package week11.day5.algorithm.c2203;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 0, b = 0, c = 0, d = 0, mok = 0, nmg = 0;
        long[] a = new long[1000];

        num = sc.nextInt();
        b = -1;

        while (true) {
            c = 2;
            d = (long) sqrt(num);

            while (true) {
                if (c > d) {
                    c = num;
                    break;
                }
                mok = num / c;
                nmg = num - mok * c;

                if (nmg == 0) {
                    break;
                } else {
                    c++;
                }
            }
            b++;
            a[(int) b] = c;
            if (num == c) {
                break;
            }
            num = mok;
        }
        System.out.println(a[(int) b]);
    }
}
