
package week5.day1.codeup.c1090;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tmp = 0;

        for (int i = 0; ; i++) {
            if (tmp + i >= a) {
                System.out.println(i);
                break;
            }
            tmp += i;
        }
        sc.close();
    }
}
