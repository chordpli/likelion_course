package week3.day5.codecup.c1040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number>0){
            System.out.println("-" + number);
        }else if (number == 0){
            System.out.println(number);
        }else {
            String input = String.valueOf(number);
            System.out.println(input.substring(1));
        }
    }
}
