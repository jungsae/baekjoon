#include <iostream>
using namespace std;

int main(){
    int num,length;
    cin >> length;
    int *arr = new int[length];

    for (int i = 0; i < length; i++)
        cin >> arr[i];
    
    cin >> num;

    int acc = 0;
    
    for (int i = 0; i < length; i++)
    {
        if(arr[i] == num ) acc++;
    };

    cout << acc;

    delete[] arr;
    return 0;
}