import java.util.*;

class Main
{
    static int n,acc;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(true)
        {
            if(n==4 || n==7)
            {
                acc = -1;
                break;
            }
            else if(n % 5 == 0)
            {
                acc += n/5;
                n /=5;
                break;
            }
            else if(n%5 == 1 || n%5 == 3)
            {
                acc +=n/5;
                acc++;
                n /=5;
                break;
            }
            else if(n%5 == 2 || n%5 == 4)
            {
                acc +=n/5;
                n /=5;
                acc+=2;
                break;
            }
        }
        System.out.println(acc);
    }
}
