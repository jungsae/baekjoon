#include <iostream>
using namespace std;

int main(){
    int amount;
    cin >> amount;
    float *arr = new float[amount];

    for (int i = 0; i < amount; i++)
    {
        cin >> arr[i];
    };

    int max = arr[0];
    
    for (int i = 1; i < amount; i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }

    float total = 0.00;

    for (int  i = 0; i < amount; i++)
    {
        arr[i] = arr[i]/max * 100;
        total = total + arr[i];
    }

    cout << total/amount;
    
    delete[] arr;
    return 0;
}