#include <iostream>
#include <array>
using namespace std;

int main()
{
    array<int,6> arr{1,1,2,2,2,8};
    array<int,6> input{};

    for(auto &x: input)
        cin >> x;
    
    for (int i = 0; i < arr.size(); i++)
    {
        int a = 0;
        a = arr[i] - input[i];
        cout << a <<' ';
    }
    

    return 0;
};