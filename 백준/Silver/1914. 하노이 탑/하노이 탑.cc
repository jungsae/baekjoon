#include <iostream>
#include <cmath>

using namespace std;

void Recur(int n, int from, int temp, int to)
{
    if (n == 1)
    {
        cout << from << ' ' << to << '\n';
    }
    else
    {
        Recur(n - 1, from, to, temp);
        cout << from << " " << to << '\n';
        Recur(n - 1, temp, from, to);
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int blocks;
    cin >> blocks;

    string count = to_string(pow(2, blocks));
    int a = count.find('.');
    count = count.substr(0, a);
    count[count.length() - 1] -= 1;
    cout << count << '\n';

    if (blocks <= 20)
        Recur(blocks, 1, 2, 3);
    

    return 0;
}
