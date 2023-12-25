import java.util.*;

public class Main
{
    static int N, M;
    static List<Integer> arr;
    static int check[];
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // N의 길이
        M = sc.nextInt(); // M개 뽑기
        sc.nextLine();

        String[] nums = sc.nextLine().split(" ");
        arr = new ArrayList<>();
        check = new int[M];
        visited = new boolean[N + 1];

        for (String num : nums)
            arr.add(Integer.parseInt(num));
        arr.sort(Comparator.naturalOrder());

        recur(0);
        System.out.println(sb.toString());
    }

    static void recur(int start)
    {
        if (start == M)
        {
            for (int i = 0; i < M; i++)
                sb.append(check[i]).append(" ");
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++)
        {
            if (!visited[i])
            {
                check[start] = arr.get(i);
                visited[i] = true;
                recur(start + 1);
                visited[i] = false;
            }
        }
    }
}
