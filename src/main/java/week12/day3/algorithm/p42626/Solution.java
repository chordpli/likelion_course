package week12.day3.algorithm.p42626;

import java.util.PriorityQueue;
/*

 1. Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶다.
 2. 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수
    + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 3. Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복
 4. Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때,
    모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는
    최소 횟수를 return 하도록 solution 함수를 작성해주세요.

 */

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int j : scoville) {
            pq.add(j);
        }

        while (pq.size() >= 2 && pq.peek() < K) {
            int mix = pq.poll() + (pq.poll() * 2);
            pq.add(mix);
            answer++;
        }
        if (pq.peek() < K) return -1;
        return answer;
    }
}
