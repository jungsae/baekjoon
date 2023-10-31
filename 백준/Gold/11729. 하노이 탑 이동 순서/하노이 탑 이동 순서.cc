#include <iostream>

using namespace std;

void Recur(int n, int from, int temp, int to)
{
    if (n == 1)
    {
        cout << from << ' ' << to << '\n';
    }
    else
    {Recur(n - 1, from, to, temp);
    cout << from << " " << to << '\n';
    Recur(n - 1, temp, from, to);}
}

int main()
{
    int blocks;
    cin >> blocks;
    cout << (1 << blocks) -1 << '\n';
    Recur(blocks, 1, 2, 3);   

    return 0;
}
