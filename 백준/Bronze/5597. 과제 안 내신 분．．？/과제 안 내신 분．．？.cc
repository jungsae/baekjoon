#include <iostream>
using namespace std;

int main(){
    int arr [31] {};
    for (int i = 0; i < 28; i++)
    {
        int temp;
        cin >> temp;
        arr[temp]++;
    }
    
    for (int i = 1; i <= 30; i++)
    {
        if(arr[i] != 1)
        {
            cout << i <<'\n';
        }
    }
    
    return 0;
}