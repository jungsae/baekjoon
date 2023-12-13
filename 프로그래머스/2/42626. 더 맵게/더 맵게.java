import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int acc = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int s : scoville) {
            pq.offer(s);
        }

        while (pq.size() >= 2 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            int newScoville = first + (second * 2);
            pq.offer(newScoville);
            acc++;
        }

        return (pq.peek() >= K) ? acc : -1;
    }
}
