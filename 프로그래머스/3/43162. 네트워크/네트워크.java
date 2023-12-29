import java.util.*;

class Solution {
    static boolean visited[];
    static int acc;
    public int solution(int n, int[][] computers) {
        acc=0;
        visited = new boolean[n];
        for(int i=0; i<n; i++)
        {
            if(!visited[i])
            {
                acc++;
                dfs(i, computers);
            }
        }
        return acc;
    }
    static void dfs(int start, int[][]com)
    {
        visited[start] = true;
        for(int i=0; i< com[start].length; i++)
        {
            if(com[start][i] == 1 && !visited[i])
            {
                visited[i] = true;
                dfs(i, com);
                System.out.println(Arrays.toString(visited));
            }
        }
    }
}