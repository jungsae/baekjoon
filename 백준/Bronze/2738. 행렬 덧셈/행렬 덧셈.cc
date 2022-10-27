#include <iostream>
using namespace std;

int main(){
    int rows,cols;
    cin >> rows >> cols;
    auto **arr = new int *[rows];

    for (int i = 0; i < rows; i++)
        arr[i] = new int [cols];
    
    for (int i = 0; i < rows; i++)
    {
        for (int  k = 0; k < cols; k++)
        {
            cin >> arr[i][k];
        }
    };

     for (int i = 0; i < rows; i++)
    {
        for (int  k = 0; k < cols; k++)
        {   
            int input = 0;
            cin >> input;
            arr[i][k] += input;
        }
    };

    for (int i = 0; i < rows; i++)
    {
        for (int  k = 0; k < cols; k++)
        {
            cout << arr[i][k] << ' ';
        }
        cout << endl;
    };
    
    for (int i = 0; i < rows; i++)
        delete[] arr[i];
    
    delete[] arr;

    return 0;
}
