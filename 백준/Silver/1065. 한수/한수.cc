#include <iostream>
using namespace std;

int math(int num)
{
    if (num < 100)
        return num;

    int cnt = 0;
    int one, ten, hund;

    for (int i = 100; i <= num; i++)
    {
        hund = i / 100;
        ten = (i % 100) / 10;
        one = (i % 100) % 10;

        if ( ten - one == hund - ten)
            cnt++;
    };

    return (99 + cnt);
};

int main()
{
    int input;
    cin >> input;
    cout << math(input) << endl;

    return 0;
}