package week5.day2.Rectangle;

import java.util.Scanner;

public class Rectangle {
    public void printRectangleMatrix(int n, int y){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <y ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        rectangle.printRectangleMatrix(n, y);
    }
}
