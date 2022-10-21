package week3.day4.codeup.c1026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] splitTime = time.split(":");

        if(splitTime[1].equals("00")){
            System.out.println("0");
        }else{
            System.out.println(splitTime[1]);
        }
        sc.close();
    }
}