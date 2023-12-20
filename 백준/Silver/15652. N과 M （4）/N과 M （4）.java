import java.util.*;

class Main
{
    static int N,M;
    static int nums[];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        nums = new int[M];

        recur(1,0);
    }
    static void recur(int current, int depth)
    {
        if(depth == M)
        {
            for(int i : nums)
                System.out.print(i + " ");
            System.out.println();
            return;
        }

        for(int i=current; i<=N; i++)
        {
                nums[depth] = i;
                recur(i, depth+1);
        }
    }
}
