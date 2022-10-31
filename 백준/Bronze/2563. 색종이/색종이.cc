#include <iostream>
using namespace std;

int main()
{   
    int acc = 0;
    int arr [110][110] = {0};
    int count;
    cin >> count;
    int x,y;
    
    while(count > 0) 
    {
        cin >> x >> y;
        for (int i = x; i < x+10; i++)
        {
            for (int j = y; j < y+10; j++)
            {
                arr[i][j]++;
            }
        }
        count--;
    };

    for (int i = x; i < x+10; i++)
    {   
        for (int j = y; j < y+10; j++)
        {
            arr[i][j]=1;
        }
    };

    for (int i = 0; i < 110; i++)
    {   
        for (int j = 0; j < 110; j++)
        {
            if(arr[i][j])
            {
                acc++;
            }
        }
    };
    cout << acc;

    return 0;
}