package week3.day2;

import java.util.Scanner;

public class CountMoney2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 25400;
        // 25000원을 받고 화폐별 몇 장으로 변환이 가능하며, 남은 금액은 얼마인가?

        int money50000 = 50000;
        int money10000 = 10000;
        int money5000 = 5000;
        int money1000 = 1000;
        int money500 = 500;
        int money100 = 100;
        int money50 = 50;
        int money10 = 10;

        // 50000원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("50000권 : %d개, 나머지 : %d 원 \n", input / money50000, input % money50000);
        input %= money50000;
        // 10000원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("10000권 : %d개, 나머지 : %d 원 \n", input / money10000, input % money10000);
        input %= money10000;
        // 5000원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("5000권 : %d개, 나머지 : %d 원 \n", input / money5000, input % money5000);
        input %= money5000;
        // 1000원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("1000권 : %d개, 나머지 : %d 원 \n", input / money1000, input % money1000);
        input %= money1000;
        // 500원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("500권 : %d개, 나머지 : %d 원 \n", input / money500, input % money500);
        input %= money500;
        // 100원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("100권 : %d개, 나머지 : %d 원 \n", input / money100, input % money100);
        input %= money100;
        // 50원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("50권 : %d개, 나머지 : %d 원 \n", input / money50, input % money50);
        input %= money50;
        // 10원으로 변환했을 때, 변환 후 남은 금액
        System.out.printf("10권 : %d장, 나머지 : %d 원 \n", input / money10, input % money10);
        input %= money10;

        sc.close();
    }
}
