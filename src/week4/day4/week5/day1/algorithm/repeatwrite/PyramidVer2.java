package week4.day4.week5.day1.algorithm.repeatwrite;

import java.util.Scanner;

public class PyramidVer2 {
    public void drawPyramid2(){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            if (count != i) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        PyramidVer2 pv = new PyramidVer2();
        pv.drawPyramid2();
    }
}
