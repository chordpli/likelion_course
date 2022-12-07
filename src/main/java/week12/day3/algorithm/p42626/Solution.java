package week12.day3.algorithm.p42626;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        while (!pq.isEmpty()) {
            int curr = pq.poll();

            if (curr < K) {
                if (pq.size() == 0) {
                    return -1;
                }
                int next = pq.poll();
                int sum = curr + next * 2;
                pq.offer(sum);
                answer++;
            }
        }
        return answer;
    }
}
