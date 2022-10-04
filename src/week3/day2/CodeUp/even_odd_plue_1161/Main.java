package week3.day2.CodeUp.even_odd_plue_1161;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
    
            if (num1 % 2 == 0) {
                System.out.print("짝수+");
            } else {
                System.out.print("홀수+");
            }
    
            if (num2 % 2 == 0) {
                System.out.print("짝수=");
            } else {
                System.out.print("홀수=");
            }
    
            if ((num1 + num2) % 2 == 0) {
                System.out.print("짝수");
            } else {
                System.out.print("홀수");
            }
        }catch (Exception e){
            System.out.println("숫자를 입력해주세요");
        }
    }
}