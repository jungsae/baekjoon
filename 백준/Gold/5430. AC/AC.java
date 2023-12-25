import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<String> results = new ArrayList<>();

        while(T-- > 0)
        {
            String commands = br.readLine();
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
            Deque<Integer> deque = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();

            while(st.hasMoreTokens())
            {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean reverse = false, error = false;

            for(char command : commands.toCharArray())
            {
                if(command == 'R')
                {
                    reverse = !reverse;
                }
                else if(command == 'D')
                {
                    if(deque.isEmpty())
                    {
                        sb.append("error\n");
                        error = true;
                        break;
                    }
                    if(reverse)
                    {
                        deque.removeLast();
                    }
                    else
                    {
                        deque.removeFirst();
                    }
                }
            }

            if(!error)
            {
                print(deque, reverse, sb);
            }

            results.add(sb.toString());
        }

        for(String result : results)
        {
            System.out.print(result);
        }
    }

    static void print(Deque<Integer> deque, boolean reverse, StringBuilder sb)
    {
        sb.append("[");
        while(!deque.isEmpty())
        {
            sb.append(reverse ? deque.pollLast() : deque.pollFirst());
            if(!deque.isEmpty())
            {
                sb.append(",");
            }
        }
        sb.append("]\n");
    }
}
