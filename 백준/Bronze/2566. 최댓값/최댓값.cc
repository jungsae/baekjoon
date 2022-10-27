#include <iostream>
using namespace std;

int main()
{   
    int arr [9][9]= {0};
    for (auto i = 0; i < 9; i++)
    {
        for (auto j = 0; j < 9; j++)
        {
            cin >> arr[i][j];
        }
        cout << endl;
    };

    int max = -1;
    int x,y;

    for (auto i = 0; i < 9; i++)
    {
        for (auto j = 0; j < 9; j++)
        {
            if(arr[i][j] > max)
            {
                max = arr[i][j];
                x = i+1;
                y = j+1;
            };
        }
    };

    cout << max << '\n' << x << ' ' << y;

    return 0;
};