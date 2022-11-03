package week7.day4.algorithm;

public class Practice {
    public static void main(String[] args) {
        int[] multiple = new int[101];
        boolean[] checks = new boolean[101];

        checks[0] = checks[1] = true;
        int count = 0;
        for (int i = 2; i * i <= multiple.length; i++) {
            if (!checks[i]) {
                for (int j = i * i; j <= multiple.length; j += i) {
                    checks[j] = true;
                    count++;
                }
            }
            System.out.println(i + ", " + count);
        }
    }
}
