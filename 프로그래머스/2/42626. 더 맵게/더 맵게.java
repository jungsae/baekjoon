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
// import java.util.ArrayList;
// import java.util.Collections;

// class Solution {
//     public int solution(int[] scoville, int K) {
//         int acc = 0;
//         ArrayList<Integer> list = new ArrayList<>();

//         for (int s : scoville) {
//             list.add(s);
//         }

//         while (!list.isEmpty()) {
//             Collections.sort(list);
//             int first = list.remove(0);

//             if (first >= K) {
//                 return acc;
//             }

//             if (list.isEmpty()) {
//                 return -1;
//             }

//             int second = list.remove(0);
//             int newScoville = first + (second * 2);
//             list.add(newScoville);
//             acc++;
//         }

//         return -1;
//     }
// }

