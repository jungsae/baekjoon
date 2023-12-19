import java.util.*;

class Main
{
    static int N,M;
    static boolean visited[];
    static int nums[];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N+1];
        nums = new int[M];

        recur(N,M, 0);
    }
    static void recur(int N, int M, int lv)
    {
        if(lv == M)
        {
            for(int i : nums)
                System.out.print(i + " ");
            System.out.println();
            return;
        }


        for(int i=0; i<N; i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                nums[lv] = i+1;
                recur(N, M, lv + 1);
                visited[i] = false;
            }
        }
    }
}
