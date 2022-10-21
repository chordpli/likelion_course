package week5.day2.Rectangle;

import java.util.Scanner;

public class Square {
    public void printSquareMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Square square = new Square();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square.printSquareMatrix(n);
    }
}
