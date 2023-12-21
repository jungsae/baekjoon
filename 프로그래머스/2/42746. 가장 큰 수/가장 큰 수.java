import java.util.Comparator;
import java.util.PriorityQueue;
class Solution {
    public String solution(int[] numbers) {
        Comparator<String> mycomp = (o1, o2) -> {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1);
        };

        PriorityQueue<String> pq = new PriorityQueue<>(mycomp);

        for(int a: numbers)
            pq.add(Integer.toString(a));

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.poll());
        }

        String result = sb.toString();
        if (result.charAt(0) == '0')
            return "0";
        else
            return result;
    }
}