#include <iostream>
using namespace std;

long long int Recur(int n)
{
    if (n <= 1)
        return 1;
    else
        return Recur(n - 1) * n;
}

int main()
{    
    ios_base::sync_with_stdio(false);
    int n;
    cin >> n;
    cout << Recur(n);
}