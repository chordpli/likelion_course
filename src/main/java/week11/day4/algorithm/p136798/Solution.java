package week11.day4.algorithm.p136798;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int number, int limit, int power) {
        List<Integer> knight = new ArrayList<>();
        // 기사 1 ~ number 지정/ 무기 구매
        // 자신의 기사 번호 약수 개수에 해당하는 공격력을 가진 무기 구매

        // 약수 구하기
        for (int i = 1; i <= number; i++) {
            int count = 0;
            count = getCountDivisior(i, count);
            knight.add(count);
        }
        int answer = 0;
        // 이웃나라와 협약에 의해 공격력의 제한 수치가 있음
        for (int i = 0; i < knight.size(); i++) {
            if (knight.get(i) > limit) {
                answer += power;
                continue;
            }
            answer += knight.get(i);
        }
        // 제한 수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는
        // 협약기관에서 정한 공격력을 가지는 무기를 구매해야함

        // 공격력 1당 1kg의 철이 필요.
        // 철의 무게 미리 계산해야함. 철의 무게 return


        return answer;
    }

    private int getCountDivisior(int i, int count) {
        for (int j = 1; j <= i; j++) {
            if (Math.floorMod(i, j) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 3, 2));
    }
}
