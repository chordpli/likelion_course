package week11.day4.algorithm.p138477;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {


    // 매일 1명의 가수가 노래 부름
    // 문자 투표수로 가수에게 점수 부여

    // 출연한 가수의 점수가 지금까지 출연한
    // 모든 참가자들의 점수중 상위 K번째 이내면 명예의 전당에 올라간다.

    // 프로그램 시작 이후 k일까지 모든 출연 가수의 점수가 명예의 전당에 오른다.

    // k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의
    // k번째 순위의 가수가 기존 명예의 전당 목록의 k번째 순위의 가수 점수보다 높으면
    // 출연 가수의 점수가 명예의 전당에 오르고
    // 기존 k번째 순위 점수는 명예의 전당에서 내려온다.
    public List<Integer> solution(int k, int[] score) {
        // 회하위 점수 return 배열
        List<Integer> answer = new ArrayList<>();
        // 명예의 전당
        Integer[] price = new Integer[k];
        Arrays.fill(price,0);
        // 명예의 전당 index
        int idx = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= price[idx]) {
                price[idx] = score[i];
                Arrays.sort(price, Collections.reverseOrder());
                answer.add(price[idx]);
                if (idx < k-1) idx++;
                continue;
            }
            answer.add(price[idx]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        Solution s = new Solution();
        System.out.println(s.solution(k,score));
    }
}
