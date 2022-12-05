package week11.day3.algorithm.p12928;

public class NoSolution {
    public int solution(int n) {
        return getSumMeasure(1, n);
    }

    public int getSumMeasure(int num, int standard) {
        if (standard == 1 || standard == 0) return 1;
        if (standard / num < num) return 0;
        if (standard % num == 0) {
            if (num * num == standard) {
                return getSumMeasure(num + 1, standard) + num;
            }else{
                return getSumMeasure(num + 1, standard) + num + (standard / num);
            }
        }
        return getSumMeasure(num + 1, standard);
    }

    public static void main(String[] args) {
        NoSolution s = new NoSolution();
        System.out.println(s.solution(16));
    }
}
