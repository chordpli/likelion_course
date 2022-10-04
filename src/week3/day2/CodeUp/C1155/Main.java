package week3.day2.CodeUp.C1155;

import java.util.Scanner;

public class Main {
    private int multipleTargetNum;

    public Main(int multipleTargetNum) {
        this.multipleTargetNum = multipleTargetNum;
    }

    public String findNumber() {
        if (multipleTargetNum % 7 == 0) {
            return "multiple";
        } else {
            return "not multiple";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Main main = new Main(sc.nextInt());
            System.out.println(main.findNumber());
        } catch (Exception e) {
            System.out.println("숫자를 입력해주세요.");
        }
        sc.close();
    }
}