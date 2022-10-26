#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int tCase;
    cin >> tCase;
    float *arr = new float[tCase];

    for (int i = 0; i < tCase; i++)
    {
        int numOfStudents;
        cin >> numOfStudents;
        float *tempArr = new float[numOfStudents];
        float acc = 0.00;
        for (int j = 0; j < numOfStudents; j++)
        {
            cin >> tempArr[j];
            acc += tempArr[j];
        };
        float ave = acc/numOfStudents;
        int count = 0;
        for (int k = 0; k < numOfStudents; k++)
        {
            if(tempArr[k] > ave)
            {
                count++;
            }
        }
        cout << fixed;
        cout.precision(3);
        arr[i] = (((float)count/numOfStudents) * 100);

        delete[] tempArr;
    }

    for (int i = 0; i < tCase; i++)
    {
        cout << arr[i] << "%" << '\n';
    }
    
    delete[] arr;
    return 0;
};