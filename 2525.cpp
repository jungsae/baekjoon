#include <iostream>
using namespace std;

int main()
{
    int hr, min, cook;
    cin >> hr >> min;
    cin >> cook;
    min = min + cook;
    while (min >= 60)
    {
        if (min >= 60)
        {
            min = (min - 60);
            hr++;

            if (hr >= 24)
            {
                hr = 0;
            }
        }
    }

    cout << hr << " " << min;
    return 0;
}