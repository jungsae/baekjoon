import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int answer[]=new int[2];

        int l=0,r=0;
        int sum=sequence[0];
        int min = Integer.MAX_VALUE;
        int len = sequence.length;

        while(l < len && r<len)
        {
            if(sum==k && min > r - l)
            {
                min = r - l;
                answer[0] = l;
                answer[1] = r;
            }

            if(sum<k)
            {
                r++;
                if(r<len)
                    sum+=sequence[r];
            }
            else
            {
                sum -= sequence[l];
                l++;
            }
        }
        return answer;
    }
}