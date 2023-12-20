import java.util.Scanner;

class Main
{
    static int N,M;
    static StringBuilder sb = new StringBuilder();
    static int arr[];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        recur(0);
        System.out.println(sb);
    }

    static void recur(int depth)
    {
        if(depth == M)
        {
            for(int i=0; i<M; i++)
                sb.append(arr[i]).append(" ");
            sb.append('\n');
            return;
        }

        for(int i=1; i <= N; i++)
        {
            arr[depth] = i;
            recur(depth+1);
        }
    }
}