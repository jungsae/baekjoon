import java.util.*;

class Solution {
    public int[] solution(String[] operations) {int[] answer = new int[]{0,0};
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(String op: operations)
        {
            String temp[] = op.split(" ");
            if(temp[0].equals("I"))
                pq.add(Integer.parseInt(temp[1]));
            else
            {
                if(pq.isEmpty())
                    continue;

                if(temp[1].equals("1"))
                    pq.poll();
                
                else
                {
                    PriorityQueue<Integer> tempQ = new PriorityQueue<>(Comparator.reverseOrder());
                    int len = pq.size();
                    for(int i=0;i<len-1;i++) tempQ.add(pq.poll());
                    pq = tempQ;
                }
            }
        }

        int biggest=0,smallest=0;
        if(pq.isEmpty())
            return answer;
        
        else if(pq.size()==1)
        {
            biggest = pq.poll();
            answer[0] = biggest;
            answer[1] = biggest;
            return answer;
        }

        else
        {
            biggest = pq.poll();
            while(!pq.isEmpty())
            {
                smallest = pq.poll();
            }
            answer[0] = biggest;
            answer[1] = smallest;
        }
        return answer;
    }
}