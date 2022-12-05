package week11.day5.algorithm.c2203;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long max = 0l;
        Long i = 2l;
        Long number = sc.nextLong();
        List<Long> ll = new ArrayList<>();
        while (number >= i) {
            if (number % i == 0) {
                max = i;
                number /= i;
                ll.add(i);
            }
            i*=i;
        }
        System.out.println(ll.toString());
    }
}
