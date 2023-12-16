import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    static int N,max;

    static char graph[][];

    public static void swap(int x1, int y1, int x2, int y2)
    {
        char temp = graph[x1][y1];
        graph[x1][y1] = graph[x2][y2];
        graph[x2][y2] = temp;
    }
    static void check()
    {
        for(int i=0; i<N; i++)
        {
            int acc = 1;
            for(int j=0; j<N-1; j++)
            {
                if(graph[i][j] == graph[i][j+1])
                {
                    acc++;
                    max = Math.max(acc, max);
                }
                else
                    acc = 1;
            }
        }

        for(int i=0; i<N; i++)
        {
            int acc = 1;
            for(int j=0; j<N-1; j++)
            {
                if(graph[j][i] == graph[j+1][i])
                {
                    acc++;
                    max = Math.max(acc, max);
                }
                else
                    acc = 1;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();

        graph = new char[N][N];

        for(int i = 0; i < N; i++)
        {
            String s = sc.nextLine();
            for(int j = 0; j < N; j++)
            {
                graph[i][j] = s.charAt(j);
            }
        }
        //System.out.println(Arrays.deepToString(graph));

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N-1; j++)
            {
                swap(i,j,i,j+1); //To Check right
                check();
                swap(i,j+1, i,j);
            }
        }

        for(int i = 0; i < N-1; i++)
        {
            for(int j = 0; j < N; j++)
            {
                swap(i,j,i+1,j); //To Check right
                check();
                swap(i+1,j, i,j);
            }
        }

        System.out.println(max);
    }
}
