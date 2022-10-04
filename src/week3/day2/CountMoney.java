package week3.day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] moneyName = {"50000원", "10000원", "5000원", "1000원", "500원", "100원", "50원", "10원"};
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        int input = 25300;
        int count = 0;
        for(int i = 0; i < 8; i++){
            count = input/money[i];
            if(count == 0){
                if(input == 0){
                    break;
                }
                continue;
            }else{
                System.out.println(moneyName[i] + count + "개");
                input -= money[i] * count;
            }
        }
    }
}
