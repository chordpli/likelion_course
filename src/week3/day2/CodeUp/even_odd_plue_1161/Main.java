package week3.day2.CodeUp.even_odd_plue_1161;

import java.util.Scanner;

public class Main {

    private String getEvenOdd(int num) {
        if(num % 2== 0){
            return "짝수";
        }else{
            return "홀수";
        }
    }

    public void printEvenOddStatement(int first, int second) {
        System.out.printf("%s+%s=%s",
                getEvenOdd(first),
                getEvenOdd(second),
                getEvenOdd(first+second));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        try{
            main.printEvenOddStatement(sc.nextInt(), sc.nextInt());
        }catch (Exception e){
            System.out.println("숫자를 입력해주세요.");
        }
    }
}