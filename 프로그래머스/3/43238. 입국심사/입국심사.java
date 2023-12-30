import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long acc = 0;
        long l = 0;
        long r = times[times.length - 1] * (long)n;
        Arrays.sort(times);

        while (l <= r) {
            long m = (l + r) / 2;
            long completedTasks = 0;

            for (int time : times)
                completedTasks += m / time;

            if (completedTasks < n)
                l = m + 1;
            else
            {
                r = m - 1;
                acc=m;
            }
        }
        return acc;
    }
}